package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import model.Entry;
import model.Person;
import db.EntryDbFacade;
import db.UserDbFacade;

public class UserSystem {
	private UserDbFacade userDb;
	private EntryDbFacade entryDb;
	private Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

	public UserSystem(){
		this(null, null);
            /*
                String url = "jdbc:postgresql://generalpostgresql.chjevgeydfg5.eu-west-1.rds.amazonaws.com:5432/generalPostgreSQL";

                Properties props = new Properties();
                props.setProperty("url", url);
                props.setProperty("user","tempdummy");//temporary user, only active for a set amount of time
                props.setProperty("password","dummyPassword");
                props.setProperty("ssl","false");

                userDb = new UserDbFacade(props);
                entryDb = new EntryDbFacade(null);
                createMenu();
                    */
	}
	
	public UserSystem(Properties propertiesUserDb, Properties propertiesEntryDb) {
		userDb = new UserDbFacade(propertiesUserDb);
		entryDb = new EntryDbFacade(propertiesEntryDb);
		createMenu();
	}
	
	public String getUserDbType() {
		return userDb.getUserDbType();
	}
	
	public String getEntryDbType() {
		return entryDb.getEntryDbType();
	}
	
	public void add(Person user) {
		userDb.add(user);
	}
	
	public void update(Person user) {
		userDb.update(user);
	}
	
	public void delete(String email) {
		userDb.delete(email);
	}
	
	public Person get(String email) {
		return userDb.get(email);
	}

	public List<Person> getAll() {
		return userDb.getAll();
	}
	
	public void addEntry(Entry entry) {
		entryDb.add(entry);
	}
	
	public void updateEntry(Entry entry) {
		entryDb.update(entry);
	}
	
	public void deleteEntry(String entryTitle, String ownerEmail) {
		entryDb.delete(entryTitle, ownerEmail);
	}
	
	public Entry getEntry(String entryTitle, String ownerEmail) {
		return entryDb.get(entryTitle, ownerEmail);
	}

	public List<Entry> getAllEntries(String ownerEmail) {
		if(userDb.get(ownerEmail)!=null) {
			return entryDb.getAll(ownerEmail);
		}
		else {
			return null;
		}
	}
	
	public List<MenuItem> getMenu(boolean authenticated) {
		List<MenuItem> items = new ArrayList<>();
		for (MenuItem item : menuItems.values()) {
			if (item.isAuthenticationNeeded() == authenticated) {
				items.add(item);
			}
		}
		return items;
	}

	public boolean isAuthenticationNeeded(String action) {
		MenuItem item = menuItems.get(action);
		boolean authenticationNeeded;
		if(item == null){
			authenticationNeeded = false;
		} else {
			authenticationNeeded = item.isAuthenticationNeeded();
		}
		return authenticationNeeded;
	}
	
	public Person getAuthenticatedUser(String email, String password){
		Person user = userDb.get(email);
		if(user!=null && !user.isPasswordCorrect(password)){
			user = null;
		}
		return user;
	}

	private void createMenu() {
		menuItems.put("Home", new MenuItem("Home", "Home", true));
		menuItems.put("userOverview", new MenuItem("userOverview", "Users", true));
		menuItems.put("logout", new MenuItem("logout", "Log out", true));
		menuItems.put("navigateToLogin", new MenuItem("navigateToLogin", "Log in"));
		menuItems.put("newUser", new MenuItem("newUser", "Register"));
		menuItems.put("friendsOverview", new MenuItem("friendsOverview", "Friends", true));
	}
}

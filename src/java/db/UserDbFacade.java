package db;

import java.time.Clock;
import java.util.List;
import java.util.Properties;

import model.Person;

public class UserDbFacade{
	
	private IUserDb userDb;
	private UserDbType userDbType;
	
	public UserDbFacade(){
		createUserDb(null);
	}
	
	public UserDbFacade(Properties properties) {
		createUserDb(properties);
	}

	private void createUserDb(Properties properties) {
		try {
			userDb = new UserDb(properties);
			userDbType = UserDbType.DATABASE;
		} catch (DbException e) {
                        System.out.println("[DB:INFO] Could not contact remote DB, switching to local " + e.getMessage());
			userDb = new UserDbLocal(properties);
			userDbType = UserDbType.LOCAL;
		}
	}

	public String getUserDbType(){
		return userDbType.name();
	}
	
	public void delete(String email) {
		userDb.delete(email);
	}

	public void update(Person person) {
		userDb.update(person);
	}

	public void add(Person person) {
		userDb.add(person);
	}

	public Person get(String email) {
		return userDb.get(email);
	}

	public List<Person> getAll() {
		return userDb.getAll();
	}
	
}

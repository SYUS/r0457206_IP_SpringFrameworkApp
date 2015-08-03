package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import model.Person;

public class UserDbLocal implements IUserDb{
	
	private HashMap<String, Person> userDbLocal;//static

	public UserDbLocal(){
		try {
			userDbLocal = new HashMap<String, Person>();
			populate();
		} catch (Exception e) {
			throw new DbException("Failed to create in memory database!");
		}
	}
	
	public UserDbLocal(Properties properties) {
		this();
	}

	private void populate() {
		Person user1 = new Person("user1", "user1@gmail.com", "password");
		Person user2 = new Person("user2", "user2@gmail.com", "password");
		Person user3 = new Person("user3", "user3@gmail.com", "password");
		
		userDbLocal.put(user1.getEmail(), user1);
		userDbLocal.put(user2.getEmail(), user2);
		userDbLocal.put(user3.getEmail(), user3);
	}

	public void delete(String email) {
		if (email == null) {
			throw new DbException("Nothing to delete.");
		}
		if (userDbLocal.containsKey(email))
			userDbLocal.remove(email);
		else throw new DbException("Nothing to delete");
	}

	public void update(Person person) {
		if (person == null) {
			throw new DbException("Nothing to update.");
		}
		if (userDbLocal.containsValue(person)) {
			userDbLocal.remove(person.getEmail());//necessary?
			userDbLocal.put(person.getEmail(), person);
		}
		else throw new DbException("Nothing to delete");
	}

	public void add(Person person) {
		if (person == null) {
			throw new DbException("Nothing to add.");
		}
		if (!userDbLocal.containsValue(person)) {
			userDbLocal.put(person.getEmail(), person);
		}
		else throw new DbException("User already exists in database");
	}

	public Person get(String email) {
		Person person = null;
		if (userDbLocal.containsKey(email)) {
			person = userDbLocal.get(email);
		}
		else {
			throw new DbException("Nothing to get");
		}
		return person;
	}

	public List<Person> getAll() {
		List<Person> persons = new ArrayList<Person>();
		if(!userDbLocal.isEmpty())
			for (Person person : userDbLocal.values())
				persons.add(person);
		else throw new DbException("Nothing to get");
		return persons;
	}
}

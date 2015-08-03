package db;

import java.util.List;

import model.Person;

public interface IUserDb {

	public void delete(String email);
	public void update(Person person);
	public void add(Person person);
	public Person get(String email);
	public List<Person> getAll();
}

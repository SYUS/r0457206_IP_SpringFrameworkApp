package db;

import java.util.List;

import model.Entry;

public interface IEntryDb {
	public void delete(String title, String ownerEmail);
	public void update(Entry entry);
	public void add(Entry entry);
	public Entry get(String title, String ownerEmail);
	public List<Entry> getAll(String ownerEmail);
}

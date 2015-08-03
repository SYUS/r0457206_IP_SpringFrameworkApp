package db;

import java.util.List;
import java.util.Properties;

import model.Entry;

public class EntryDbFacade{
	
	private IEntryDb entryDb;
	private EntryDbType entryDbType;
	
	public EntryDbFacade(){
		createEntryDb(null);
	}
	
	public EntryDbFacade(Properties properties) {
		createEntryDb(properties);
	}

	private void createEntryDb(Properties properties) {
		try {
			entryDb = new EntryDb(properties);
			entryDbType = EntryDbType.DATABASE;
		} catch (DbException e) {
                        System.out.println("[DB:INFO] Could not contact remote DB, switching to local " + e.getMessage());
			entryDb = new EntryDbLocal(properties);
			entryDbType = EntryDbType.LOCAL;
		}
	}
	
	public String getEntryDbType(){
		return entryDbType.name();
	}
	
	//Entry DB CRUD
	
	public void delete(String title, String ownerEmail) {
		entryDb.delete(title, ownerEmail);
	}

	public void update(Entry entry) {
		entryDb.update(entry);
	}

	public void add(Entry entry) {
		entryDb.add(entry);
	}

	public Entry get(String title, String ownerEmail) {
		return entryDb.get(title, ownerEmail);
	}
	
	public List<Entry> getAll(String ownerEmail) {
		return entryDb.getAll(ownerEmail);
	}
}

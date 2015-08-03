package db;

import java.util.List;
import java.util.Properties;

import model.Entry;

public class EntryDb implements IEntryDb{

	public EntryDb(){}
	
	public EntryDb(Properties properties) {
		// TODO Auto-generated constructor stub
		throw new DbException("WIP, switching to local entry db");
	}

	@Override
	public void delete(String title, String ownerEmail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Entry entry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Entry entry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Entry get(String title, String ownerEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entry> getAll(String ownerEmail) {
		// TODO Auto-generated method stub
		return null;
	}

}

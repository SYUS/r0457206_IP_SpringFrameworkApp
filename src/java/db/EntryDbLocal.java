package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import model.Entry;
import model.Person;

public class EntryDbLocal implements IEntryDb{

	private HashMap<String,ArrayList<Entry>> entryDbLocal;
        //mapped by ownermail
	
	public EntryDbLocal(){
		try {
			entryDbLocal = new HashMap<String, ArrayList<Entry>>();
			populate();
		} catch (Exception e) {
			throw new DbException("Failed to create in memory database!");
		}
	}
	
	public EntryDbLocal(Properties properties) {
            //Handling this stupidly for now, still need to implement the actual non-local DB
		this();
	}

	private void populate() {
                //Person user1 = new Person("Mark", "Mark@gmail.com", "password");
		//Person user2 = new Person("Ranjit", "Ranjit@gmail.com", "password");
		//Person user3 = new Person("Cheese", "Cheese@gmail.com", "password");
		Person user1 = new Person("user1", "user1@gmail.com", "password");
		Person user2 = new Person("user2", "user2@gmail.com", "password");
		Person user3 = new Person("user3", "user3@gmail.com", "password");
                
                Person user4 = new Person("Robin", "Robin@gmail.com", "password");
		Person user5 = new Person("Ted", "Ted@gmail.com", "password");
                Person user6 = new Person("Barney", "Barney@gmail.com", "password");
                Person user7 = new Person("Lilly", "Lilly@gmail.com", "password");
                Person user8 = new Person("Marshall", "Marshall@gmail.com", "password");
                Person user9 = new Person("Swarley", "Swarley@gmail.com", "password");
                
		
                Entry entryDud1User1 = new Entry("entryDud1User1", "today", user1.getEmail(), "White", "entryDud1User1 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud2User1 = new Entry("entryDud2User1", "today", user1.getEmail(), "Grey", "entryDud2User1 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud3User1 = new Entry("entryDud3User1", "today", user1.getEmail(), "Black", "entryDud3User1 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
                Entry entryDud4User1 = new Entry("entryDud4User1", "today", user1.getEmail(), "Grey", "entryDud4User1 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud5User1 = new Entry("entryDud5User1", "today", user1.getEmail(), "Black", "entryDud5User1 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		
                ArrayList<Entry> user1Entries = new ArrayList<>();
                user1Entries.add(entryDud1User1);
                user1Entries.add(entryDud2User1);
                user1Entries.add(entryDud3User1);
                user1Entries.add(entryDud4User1);
                user1Entries.add(entryDud5User1);
                
		
                Entry entryDud1User2 = new Entry("entryDud1User2", "today", user2.getEmail(), "White", "entryDud1User2 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud2User2 = new Entry("entryDud2User2", "today", user2.getEmail(), "Grey", "entryDud2User2 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud3User2 = new Entry("entryDud3User2", "today", user2.getEmail(), "Black", "entryDud3User2 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
                Entry entryDud4User2 = new Entry("entryDud4User2", "today", user2.getEmail(), "Grey", "entryDud4User2 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud5User2 = new Entry("entryDud5User2", "today", user2.getEmail(), "Black", "entryDud5User2 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		
                ArrayList<Entry> user2Entries = new ArrayList<>();
                user2Entries.add(entryDud1User2);
                user2Entries.add(entryDud2User2);
                user2Entries.add(entryDud3User2);
                user2Entries.add(entryDud4User2);
                user2Entries.add(entryDud5User2);
                
		
                Entry entryDud1User3 = new Entry("entryDud1User3", "today", user3.getEmail(), "White", "entryDud1User3 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud2User3 = new Entry("entryDud2User3", "today", user3.getEmail(), "Grey", "entryDud2User3 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud3User3 = new Entry("entryDud3User3", "today", user3.getEmail(), "Black", "entryDud3User3 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
                Entry entryDud4User3 = new Entry("entryDud4User3", "today", user3.getEmail(), "Black", "entryDud4User3 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud5User3 = new Entry("entryDud5User3", "today", user3.getEmail(), "Black", "entryDud5User3 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");

                
                ArrayList<Entry> user3Entries = new ArrayList<>();
                user3Entries.add(entryDud1User3);
                user3Entries.add(entryDud2User3);
                user3Entries.add(entryDud3User3);
                user3Entries.add(entryDud4User3);
                user3Entries.add(entryDud5User3);
                
                Entry entryDud1User4 = new Entry("entryDud1User4", "today", user4.getEmail(), "White", "entryDud1User4 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud2User4 = new Entry("entryDud2User4", "today", user4.getEmail(), "Grey", "entryDud2User4 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud3User4 = new Entry("entryDud3User4", "today", user4.getEmail(), "Black", "entryDud3User4 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
                Entry entryDud4User4 = new Entry("entryDud4User4", "today", user4.getEmail(), "Black", "entryDud4User4 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud5User4 = new Entry("entryDud5User4", "today", user4.getEmail(), "Black", "entryDud5User4 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");

                
                ArrayList<Entry> user4Entries = new ArrayList<>();
                user4Entries.add(entryDud1User4);
                user4Entries.add(entryDud2User4);
                user4Entries.add(entryDud3User4);
                user4Entries.add(entryDud4User4);
                user4Entries.add(entryDud5User4);
                
                Entry entryDud1User5 = new Entry("entryDud1User5", "today", user5.getEmail(), "White", "entryDud1User5 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud2User5 = new Entry("entryDud2User5", "today", user5.getEmail(), "Grey", "entryDud2User5 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud3User5 = new Entry("entryDud3User5", "today", user5.getEmail(), "Black", "entryDud3User5 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud4User5 = new Entry("entryDud4User5", "today", user5.getEmail(), "Black", "entryDud4User5 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud5User5 = new Entry("entryDud5User5", "today", user5.getEmail(), "Black", "entryDud5User5 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");

                
                ArrayList<Entry> user5Entries = new ArrayList<>();
                user5Entries.add(entryDud1User5);
                user5Entries.add(entryDud2User5);
                user5Entries.add(entryDud3User5);
                user5Entries.add(entryDud4User5);
                user5Entries.add(entryDud5User5);
                
                Entry entryDud1User6 = new Entry("entryDud1User6", "today", user6.getEmail(), "White", "entryDud1User6 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud2User6 = new Entry("entryDud2User6", "today", user6.getEmail(), "Grey", "entryDud2User6 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud3User6 = new Entry("entryDud3User6", "today", user6.getEmail(), "Black", "entryDud3User6 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud4User6 = new Entry("entryDud4User6", "today", user6.getEmail(), "Black", "entryDud4User6 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud5User6 = new Entry("entryDud5User6", "today", user6.getEmail(), "Black", "entryDud5User6 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");

                
                ArrayList<Entry> user6Entries = new ArrayList<>();
                user6Entries.add(entryDud1User6);
                user6Entries.add(entryDud2User6);
                user6Entries.add(entryDud3User6);
                user6Entries.add(entryDud4User6);
                user6Entries.add(entryDud5User6);
                
                
                Entry entryDud1User7 = new Entry("entryDud1User7", "today", user7.getEmail(), "White", "entryDud1User7 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud2User7 = new Entry("entryDud2User7", "today", user7.getEmail(), "Grey", "entryDud2User7 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud3User7 = new Entry("entryDud3User7", "today", user7.getEmail(), "Black", "entryDud3User7 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud4User7 = new Entry("entryDud4User7", "today", user7.getEmail(), "Black", "entryDud4User7 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud5User7 = new Entry("entryDud5User7", "today", user7.getEmail(), "Black", "entryDud5User7 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");

                
                ArrayList<Entry> user7Entries = new ArrayList<>();
                user7Entries.add(entryDud1User7);
                user7Entries.add(entryDud2User7);
                user7Entries.add(entryDud3User7);
                user7Entries.add(entryDud4User7);
                user7Entries.add(entryDud5User7);
                
                
                Entry entryDud1User8 = new Entry("entryDud1User8", "today", user8.getEmail(), "White", "entryDud1User8 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud2User8 = new Entry("entryDud2User8", "today", user8.getEmail(), "Grey", "entryDud2User8 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud3User8 = new Entry("entryDud3User8", "today", user8.getEmail(), "Black", "entryDud3User8 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud4User8 = new Entry("entryDud4User8", "today", user8.getEmail(), "Black", "entryDud4User8 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud5User8 = new Entry("entryDud5User8", "today", user8.getEmail(), "Black", "entryDud5User8 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");

                
                ArrayList<Entry> user8Entries = new ArrayList<>();
                user8Entries.add(entryDud1User8);
                user8Entries.add(entryDud2User8);
                user8Entries.add(entryDud3User8);
                user8Entries.add(entryDud4User8);
                user8Entries.add(entryDud5User8);
                
                
                Entry entryDud1User9 = new Entry("entryDud1User9", "today", user9.getEmail(), "White", "entryDud1User9 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud2User9 = new Entry("entryDud2User9", "today", user9.getEmail(), "Grey", "entryDud2User9 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud3User9 = new Entry("entryDud3User9", "today", user9.getEmail(), "Black", "entryDud3User9 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud4User9 = new Entry("entryDud4User9", "today", user9.getEmail(), "Black", "entryDud4User9 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");
		Entry entryDud5User9 = new Entry("entryDud5User9", "today", user9.getEmail(), "Black", "entryDud5User9 Summary example Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur sit, minima consequatur saepe dolore voluptatum! Totam amet delectus assumenda similique porro, quis suscipit quasi cupiditate asperiores ducimus incidunt soluta sint?");

                
                ArrayList<Entry> user9Entries = new ArrayList<>();
                user9Entries.add(entryDud1User9);
                user9Entries.add(entryDud2User9);
                user9Entries.add(entryDud3User9);
                user9Entries.add(entryDud4User9);
                user9Entries.add(entryDud5User9);
                
		entryDbLocal.put(user1.getEmail(), user1Entries);
		entryDbLocal.put(user2.getEmail(), user2Entries);
		entryDbLocal.put(user3.getEmail(), user3Entries);
                entryDbLocal.put(user4.getEmail(), user4Entries);
		entryDbLocal.put(user5.getEmail(), user5Entries);
                entryDbLocal.put(user6.getEmail(), user6Entries);
                entryDbLocal.put(user7.getEmail(), user7Entries);
                entryDbLocal.put(user8.getEmail(), user8Entries);
                entryDbLocal.put(user9.getEmail(), user9Entries);
	}

	@Override
	public void delete(String title, String ownerEmail) {
		if (title == null || ownerEmail == null ) {
			throw new DbException("Nothing to delete.");
		}
		if (entryDbLocal.get(ownerEmail).contains(this.get(title, ownerEmail))) {
			entryDbLocal.remove(title);
                } else {
                    throw new DbException("Nothing to delete");
                }
	}

	@Override
	public void update(Entry entry) {
		if (entry == null) {
			throw new DbException("Nothing to update.");
		}
                if (entryDbLocal.get(entry.getOwnerEmail()).contains(entry)) {
			entryDbLocal.get(entry.getOwnerEmail()).remove(entry);//necessary?
			entryDbLocal.get(entry.getOwnerEmail()).add(entry);
		}else {
                    System.out.println("status was: " + entryDbLocal.get(entry.getOwnerEmail()).contains(entry));
                    throw new DbException("Nothing to update, entry not found");
                }
	}

	@Override
	public void add(Entry entry) {
		if (entry == null) {
			throw new DbException("Nothing to add.");
		}
		if (!entryDbLocal.get(entry.getOwnerEmail()).contains(entry)) {
			entryDbLocal.get(entry.getOwnerEmail()).add(entry);
		}
		else throw new DbException("Entry already exists in database");
	}

	@Override //if two persons enter the same title, things will hit the fan, I need to find a better way to do this...
	public Entry get(String title, String ownerEmail) {
                for(Entry e : entryDbLocal.get(ownerEmail)) {
                    if(e.getTitle().equals(title)){
                            return e;
                        }
                }
		return null;
	}

	@Override
	public List<Entry> getAll(String ownerEmail) {
		List<Entry> entries = new ArrayList<Entry>();
		if(!entryDbLocal.isEmpty()) {
                    entries = entryDbLocal.get(ownerEmail);
		}
		else {
			throw new DbException("Nothing to get");
		}
		return entries;
	}

}

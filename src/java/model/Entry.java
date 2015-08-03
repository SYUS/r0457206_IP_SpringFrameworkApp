package model;

import java.util.Objects;

public class Entry {
	private String title;
	private String date;
	private String colour = "-- no colour chosen --";
	private String summary = "-- No summary added, try to write something next time! --";
	private String ownerEmail;

	public Entry() {}
	
	public Entry(String title, String date, String ownerEmail) {
		setTitle(title);
		setDate(date);
		setOwnerEmail(ownerEmail);
	}
	
	public Entry(String title, String date, String ownerEmail, String colour, String summary) {
		this(title, date, ownerEmail);
		setColour(colour);
		setSummary(summary);
	}
	
	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public String getTitle() {
		return title;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSummary() {
		return summary;
	}
	
	public void setTitle(String title) {
		if (title == null || title.isEmpty()) {
			throw new ModelException("Entry title should not be empty");
		}
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		if (date == null || date.isEmpty()) {
			throw new ModelException("Entry date should not be empty");
		}
		this.date = date;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Entry other = (Entry) obj;
            if (!Objects.equals(this.title, other.title)) {
                return false;
            }
            if (!Objects.equals(this.ownerEmail, other.ownerEmail)) {
                return false;
            }
            return true;
        }
        
        
	
}

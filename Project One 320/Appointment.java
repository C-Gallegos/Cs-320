package Appointment;

import java.util.Date;
public class Appointment {
	
	private String iD;
	private Date date;
	private String description;
	
	
	private final boolean validId(String iD) {
		if (iD == null||iD.length()>10) {
			return false;
		}
		return true;
	}
	
	private final boolean validDate (Date date) {
		if (date== null||date.before(new Date())) {
			return false;
		}
		return true;
	}
	
	
	private final boolean validDescription(String description) {
		if(description == null||description.length()>50||description.equals("")) {
			return false;
		}
		return true;
	}
	
	public Appointment (String iD,Date date, String description) {
		
		if (!this.validId(iD)) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(!this.validDate(date)) {
			throw new IllegalArgumentException("Invalid Date");
		}
		if(!this.validDescription(description)) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		setId(iD);
		setDate(date);
		setDescription(description);
	}
	
	public int getId() {
		return Integer.valueOf(iD);
	}
	
	public void setId(String iD) {
		this.iD= iD;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		if(!this.validDate(date)) {
			throw new IllegalArgumentException("Invalid Date");
		}
		this.date=date;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		if(!this.validDescription(description)) {
			throw new IllegalArgumentException("Invalid Description");	
		}
		this.description= description;
	}
}

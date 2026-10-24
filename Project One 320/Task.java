package Task;

public class Task {
	private String id;
	private String fullName;
	private String description;
	
	
	private final boolean validId(String id) {
		if (id == null ||id.length()>10) {
			return false;
		}
		return true;
	}
	
	
	private final boolean validName (String fullName) {
		if(fullName == null || fullName.length()>20|| fullName.equals("")) {
			return false;
		}
		return true;
	}
	private final boolean validDescription (String description) {
		if(description == null || description.length()>50|| description.equals("")) {
			return false;
		}
		return true;
	}
	
	
	public Task (String id,String fullName, String description) {
		
		if(!this.validId(id)) {
			throw new IllegalArgumentException("Invalid Id");
		}
		if(!this.validName(fullName)) {
			throw new IllegalArgumentException("Invalid Name");
		}
		if(!this.validDescription(description)) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		setId(id);
		setFullName(fullName);
		setDescription(description);
		
	}


	public int getId() {
		return Integer.valueOf(id);
	}


	public void setId(String id) {
		if(!this.validId(id)) {
			throw new IllegalArgumentException("Invalid Id");
		}
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		if(!this.validName(fullName)) {
			throw new IllegalArgumentException("Invalid Name");
		
			}
		this.fullName = fullName;
		}

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		if(!this.validDescription(description)) {
			throw new IllegalArgumentException("Invalid Description");
		}
		this.description = description;
	}
}

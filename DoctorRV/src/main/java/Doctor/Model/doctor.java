package Doctor.Model;

public class doctor{
	
	private int id;
	private String name;
	private String speciality;
	
	
	
	
	
	public doctor(int id, String name, String speciality) {
		
		this.id = id;
		this.name = name;
		this.speciality = speciality;
	}
	
	public doctor( String name, String speciality) {
		
		
		this.name = name;
		this.speciality = speciality;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	
}
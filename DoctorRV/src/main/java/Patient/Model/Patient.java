package Patient.Model;

public class Patient{
	
	private int id;
	private String username;
	private String email;
	private String tele;
	
	
	
	

	public Patient(int id, String username, String email, String tele) {
		
		this.id = id;
		this.username = username;
		this.email = email;
		this.tele = tele;
	}
	
public Patient( String username, String email, String tele) {
		
		
		this.username = username;
		this.email = email;
		this.tele = tele;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	
}
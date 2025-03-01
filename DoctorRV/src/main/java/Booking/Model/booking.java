package Booking.Model;


public class booking{
	
	private int id;
    private int patientId;
    private int doctorId;
    private String date;
    private String motif;
    private String patientName;
    private String doctorName;

    
    
    
	public booking(int id, int patientId, int doctorId, String date, String motif) {
		
		this.id = id;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.date = date;
		this.motif = motif;
		
	}
	
	public booking( int patientId, int doctorId, String date, String motif) {
		
		
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.date = date;
		this.motif = motif;
	}
	
	
	
	public  int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    
}
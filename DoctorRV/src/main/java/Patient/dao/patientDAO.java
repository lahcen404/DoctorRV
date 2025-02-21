package Patient.dao;

import java.sql.Connection;  // For handling DB connections
import java.sql.DriverManager;  // For MySQL JDBC
import java.sql.PreparedStatement;  // For executing SQL queries
import java.sql.ResultSet;  // For result set handling
import java.sql.SQLException;  // For handling SQL exceptions
import java.util.ArrayList;  // For handling collections
import java.util.List;  // For collections
import Patient.Model.patient;  // For the patient model





public class patientDAO{
	
    private String jdbcURL = "jdbc:mysql://localhost:3306/DoctorDB?useSSL=false";
    private String jdbcUsername = "root";  
    private String jdbcPassword = "lahcen123"; 
	
    private static final String INSERT_PATIENT_SQL = "INSERT INTO Patient ( username,  email,  tele) VALUES ( ?, ?, ?)";
    private static final String SELECT_ALL_PATIENTS = " SELECT * FROM Patient ";
    private static final String SELECT_PATIENT_BY_ID = "SELECT * FROM Patient WHERE Patient_ID = ?";
    private static final String DELETE_PATIENT_SQL = "DELETE FROM Patient WHERE Patient_ID = ?";

    
    // Connection method
    protected Connection getConnection() {
        Connection connection = null;
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(connection);
        return connection;
    }
    
    //insert a Patient
    public void insertPatient(patient patient)throws SQLException{
    	
    	try(Connection connection = getConnection() ;
    			PreparedStatement stmnt = connection.prepareStatement(INSERT_PATIENT_SQL)){
			stmnt.setString(1,patient.getUsername());
			stmnt.setString(2,patient.getEmail());
			stmnt.setString(3,patient.getTele());
			stmnt.executeUpdate();
    			}
    }
    
    
    // select all patients
    public List<patient> selectAllPatient() throws SQLException {
        List<patient> patients = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement stmnt = connection.prepareStatement(SELECT_ALL_PATIENTS);
             ResultSet rs = stmnt.executeQuery()) {
        	System.out.println( "connected on " + connection );
            while (rs.next()) {
                patients.add(new patient(
                   
                    rs.getString("username"),
                    rs.getString("email"),
                    rs.getString("tele")
                ));
            }
        }
        return patients;
    }
    
    // Delete Patient
    public void deletePatient(int id) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement stmnt = connection.prepareStatement(DELETE_PATIENT_SQL)) {
            stmnt.setInt(1, id);
            stmnt.executeUpdate();
            
        }
    }
}
    

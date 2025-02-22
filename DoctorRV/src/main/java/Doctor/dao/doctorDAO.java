package Doctor.dao;

import  Doctor.Model.doctor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;




public class doctorDAO{
	
    private String jdbcURL = "jdbc:mysql://localhost:3306/DoctorDB?useSSL=false";
    private String jdbcUsername = "root";  
    private String jdbcPassword = "lahcen123"; 
	
    private static final String INSERT_DOCTOR_SQL = "INSERT INTO Doctor ( Doctor_ID,  Name,  Speciality ) VALUES (  ?, ?, ?)";
    private static final String SELECT_ALL_DOCTOR = " SELECT * FROM Doctor ";
    private static final String SELECT_DOCTOR_BY_ID = "SELECT * FROM Doctor WHERE Doctor_ID = ?";
    private static final String DELETE_DOCTOR_SQL = "DELETE FROM Doctor WHERE Doctor_ID = ?";

    
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
    
    //insert a Booking
    public void insertDoctor(doctor doctor)throws SQLException{
    	
    	try(Connection connection = getConnection() ;
    			PreparedStatement stmnt = connection.prepareStatement(INSERT_DOCTOR_SQL)){
			stmnt.setInt(1,doctor.getId());
			stmnt.setString(2,doctor.getName());
			stmnt.setString(3,doctor.getSpeciality());
			

			stmnt.executeUpdate();
    			}
    }
    
    
    // select all BOOKING
    public List<doctor> selectAllDoctor() throws SQLException {
        List<doctor> doctors = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement stmnt = connection.prepareStatement(SELECT_ALL_DOCTOR);
             ResultSet rs = stmnt.executeQuery()) {
        	System.out.println( "connected on " + connection );
            while (rs.next()) {
                doctors.add(new doctor(
                   
                  
                    rs.getString("name"),
                    rs.getString("s")
                ));
            }
        }
        return doctors;
    }
    
   

	
}
    

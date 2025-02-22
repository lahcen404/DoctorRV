package Booking.dao;

import  Booking.Model.booking;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;




public class bookingDAO{
	
    private String jdbcURL = "jdbc:mysql://localhost:3306/DoctorDB?useSSL=false";
    private String jdbcUsername = "root";  
    private String jdbcPassword = "lahcen123"; 
	
    private static final String INSERT_BOOKING_SQL = "INSERT INTO Appoitnment ( Appointment_ID,  Appointment_Date,  Motif , Patient_ID , Doctor_ID) VALUES ( ?, ?, ?, ?, ?)";
    private static final String SELECT_ALL_BOOKING = " SELECT * FROM Appoitnment ";
    private static final String SELECT_BOOKING_BY_ID = "SELECT * FROM Appoitnment WHERE Appointment_ID = ?";
    private static final String DELETE_BOOKING_SQL = "DELETE FROM Appoitnment WHERE ID = ?";

    
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
    public void insertBooking(booking booking)throws SQLException{
    	
    	try(Connection connection = getConnection() ;
    			PreparedStatement stmnt = connection.prepareStatement(INSERT_BOOKING_SQL)){
			stmnt.setInt(1,booking.getPatientId());
			stmnt.setInt(2,booking.getDoctorId());
			stmnt.setString(3,booking.getDate());
			stmnt.setString(4,booking.getMotif());

			stmnt.executeUpdate();
    			}
    }
    
    
    // select all BOOKING
    public List<booking> selectAllAppointments() throws SQLException {
        List<booking> appointments = new ArrayList<>();
        String query = "SELECT a.Appointment_ID, a.Appointment_Date, a.Motif, " +
                       "p.Username AS PatientName, d.Name AS DoctorName " +
                       "FROM Appointment a " +
                       "JOIN Patient p ON a.Patient_ID = p.Patient_ID " +
                       "JOIN Doctor d ON a.Doctor_ID = d.Doctor_ID";

        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                booking booking = new booking(
                    rs.getInt("Appointment_ID"),
                    rs.getInt("Patient_ID"),
                    rs.getInt("Doctor_ID"),
                    rs.getString("Appointment_Date"),
                    rs.getString("Motif")
                );
                booking.setPatientName(rs.getString("PatientName"));
                booking.setDoctorName(rs.getString("DoctorName"));
                appointments.add(booking);
            }
        }
        return appointments;
    }
    
    // Delete Patient
    public void deleteBooking(int id) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement stmnt = connection.prepareStatement(DELETE_BOOKING_SQL)) {
            stmnt.setInt(1, id);
            stmnt.executeUpdate();
            
        }
    }

	
}
    

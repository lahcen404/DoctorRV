package Booking.dao;

import  Booking.Model.booking;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date; 




public class bookingDAO{
	
    private String jdbcURL = "jdbc:mysql://localhost:3306/DoctorDB?useSSL=false";
    private String jdbcUsername = "root";  
    private String jdbcPassword = "lahcen123"; 
	
    private static final String INSERT_BOOKING_SQL = "INSERT INTO Appoinment ( Appoinment_ID,  Appoinment_Date,  Motif , Patient_ID , Doctor_ID) VALUES ( ?, ?, ?, ?, ?)";
    private static final String SELECT_ALL_BOOKING = " SELECT * FROM Appoinment ";
    private static final String SELECT_BOOKING_BY_ID = "SELECT * FROM Appoinment WHERE Appoinment_ID = ?";
    private static final String DELETE_BOOKING_SQL = "DELETE FROM Appoinment WHERE ID = ?";

    
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
    public List<booking> selectAllBooking() throws SQLException {
        List<booking> bookings = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement stmnt = connection.prepareStatement(SELECT_ALL_BOOKING);
             ResultSet rs = stmnt.executeQuery()) {
        	System.out.println( "connected on " + connection );
            while (rs.next()) {
                bookings.add(new booking(
                   
                    rs.getInt("patientId"),
                    rs.getInt("getDoctorId"),
                    rs.getString("getDate"),
                    rs.getString("getMotif")
                ));
            }
        }
        return bookings;
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
    

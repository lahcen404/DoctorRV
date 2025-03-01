package Booking.Controller;

import Booking.dao.bookingDAO;
import Booking.Model.booking;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;





@WebServlet("/booking")

public class bookingServlet extends HttpServlet{
	    private static final long serialVersionUID = 1L;
	    private bookingDAO bookingDAO;
	    
	    public void init() {
	    	this.bookingDAO = new bookingDAO();
	    }
	    
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        doGet(request, response);
	    }   
	    
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String action = request.getServletPath();

	        try {
	            switch (action) {
	                case "/list":
	                    listAppointments(request, response);
	                    break;
	                default:
	                    listAppointments(request, response);
	                    break;
	            }
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	    }
	   
	    
	    private void insertBooking(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException {
	    	
	        int patientID = Integer.parseInt(request.getParameter("patientId"));
	        int doctorID = Integer.parseInt(request.getParameter("doctorId"));
	        String date = request.getParameter("date");
	        String motif = request.getParameter("motif");
	       
	        booking newBooking = new booking(patientID,doctorID,date,motif);
	        bookingDAO.insertBooking(newBooking);
	        response.sendRedirect(request.getContextPath() + "/list");
	    }
	    
	    
	    private void listAppointments(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
	        List<booking> appointments = bookingDAO.selectAllAppointments();
	        request.setAttribute("appointments", appointments);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("bookAppointments.jsp");
	        dispatcher.forward(request, response);
	    }
	    
	    private void deleteBooking(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException {
	        int id = Integer.parseInt(request.getParameter("id"));
	        bookingDAO.deleteBooking(id);
	        response.sendRedirect(request.getContextPath() + "/list");
	    }
}
package Patient.Controller;

import Patient.dao.patientDAO;
import Patient.Model.patient;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;





@WebServlet("/patient")

public class patientServlet extends HttpServlet{
	    private static final long serialVersionUID = 1L;
	    private patientDAO patientDAO;
	    
	    public void init() {
	    	patientDAO = new patientDAO();
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
	               
	                case "/insert":
	                	insertPatient(request, response);
	                    break;
	                case "/list":
	                	listPatient(request, response);
	                    break;
	                default:
	                    listPatient(request, response);
	                    break;
	            }
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	    }
	   
	    
	    private void insertPatient(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException {
	        String username = request.getParameter("username");
	        String email = request.getParameter("email");
	        String tele = request.getParameter("tele");
	       
	        patient newPatient = new patient(username,email,tele);
	        patientDAO.insertPatient(newPatient);
	        response.sendRedirect(request.getContextPath() + "/list");
	    }
	    
	    
	    private void listPatient(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
	        List<patient> listPatient = patientDAO.selectAllPatient();
	        
	        // tester list 
	        listPatient.forEach(Patient -> System.out.println(Patient.getUsername()));
	        
	        request.setAttribute("listPatient", listPatient);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("patientDashboard.jsp");
	        dispatcher.forward(request, response);
	    }
	    
	    private void deletePatient(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException {
	        int id = Integer.parseInt(request.getParameter("id"));
	        patientDAO.deletePatient(id);
	        response.sendRedirect("patients");
	    }
}
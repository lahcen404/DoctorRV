package Doctor.Controller;

import Doctor.dao.doctorDAO;
import Doctor.Model.doctor;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;





@WebServlet("/doctor")

public class doctorServlet extends HttpServlet{
	    private static final long serialVersionUID = 1L;
	    private doctorDAO doctorDAO;
	    
	    public void init() {
	    	doctorDAO = new doctorDAO();
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
	                	// insertDoctor(request, response);
	                    break;
	                case "/list":
	                	listDoctor(request, response);
	                    break;
	                default:
	                    listDoctor(request, response);
	                    break;
	            }
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	    }
	   
	    
	   
	    
	    
	    private void listDoctor(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
	        List<doctor> listDoctor = doctorDAO.selectAllDoctor();
	        
	        // tester list 
	        listDoctor.forEach(Doctor -> System.out.println(Doctor.getName()));
	        
	        request.setAttribute("listPatient", listDoctor);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("doctorDashboard.jsp");
	        dispatcher.forward(request, response);
	    }
	    
	 
}
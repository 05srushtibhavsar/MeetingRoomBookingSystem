package system.model.webcontrol;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import system.model.database.ProcessWithDatabase;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/AdminLoginpage")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProcessWithDatabase processdata;
  
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		processdata = new ProcessWithDatabase();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		System.out.println("Hello from post ");
	
		String mobile = request.getParameter("Mobile");
		String password = request.getParameter("Password");
		
		try {
			boolean status = processdata.validateAdminLogin(mobile, password);
			if(status==true)
			{
		
				response.sendRedirect("AdminHomePage.jsp");
			}
			else
			{
				request.setAttribute("errorMessage","Mobile Number or Password incorrect..");
				RequestDispatcher dis = request.getRequestDispatcher("AdminLogin.jsp");
				dis.forward(request, response);
//				response.sendRedirect("AdminLogin.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		
//		System.out.println("Hello from get");
//	
//		String mobile = request.getParameter("ID");
//		String password = request.getParameter("Password");
//		
//		try {
//			boolean status = processdata.validateAdminLogin(mobile, password);
//			if(status==true)
//			{
//		
//				response.sendRedirect("AdminHomePage.jsp");
//			}
//			else
//			{
//				RequestDispatcher dis = request.getRequestDispatcher("AdminLogin.jsp");
//				dis.include(request, response);
//				
////				response.sendRedirect("AdminLogin.jsp");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}

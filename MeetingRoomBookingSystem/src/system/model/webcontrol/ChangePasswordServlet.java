package system.model.webcontrol;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import system.model.database.ProcessWithDatabase;

/**
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProcessWithDatabase processdata;
	public static String errorMessage=null;
  
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		processdata = new ProcessWithDatabase();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		System.out.println("Hello from Change Password post ");
		
		String oldPass = request.getParameter("OldPassword");
		String newPassword = request.getParameter("NewPassword");
		String confirmPassword = request.getParameter("ConfirmPassword");
		
		
		try {
			if(newPassword.equals(confirmPassword))
			{
				boolean status = processdata.changeAdminPassword(oldPass, newPassword);
				if(status==true)
				{
			
					response.sendRedirect("AdminHomePage.jsp");
				}
				else
				{
					errorMessage="Incorrect Old Password";
					response.sendRedirect("AdminChangePassword.jsp");
				}
			}
			else
			{
				errorMessage = "New Password and Confirm Password Not Matched";
				response.sendRedirect("AdminChangePassword.jsp");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

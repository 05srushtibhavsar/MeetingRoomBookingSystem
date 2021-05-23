package system.model.webcontrol;

import java.io.IOException;
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
 * Servlet implementation class EmpChangePasswordServlet
 */
@WebServlet("/EmpChangePasswordServlet")
public class EmpChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProcessWithDatabase processdata;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		processdata = new ProcessWithDatabase();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	System.out.println("Hello from Change Password post ");
		
		String oldPass = request.getParameter("Old_Password");
		String newPassword = request.getParameter("New_Password");
		String confirmPassword = request.getParameter("Confirm_Password");
		
		
		try {
			if(newPassword.equals(confirmPassword))
			{
				boolean status = processdata.changeEmpPassword(oldPass, newPassword);
				if(status==true)
				{
			
					response.sendRedirect("EmpHomePage.jsp");
				}
				else
				{
					request.setAttribute("errorMessage","Failed To Change Password. Old Password Does not matched");
					RequestDispatcher dis = request.getRequestDispatcher("EmpChangePassword.jsp");
					dis.forward(request, response);
				}
			}
			else
			{
				request.setAttribute("errorMessage","New Password and Confirm Password Does Not Match");
				RequestDispatcher dis = request.getRequestDispatcher("EmpChangePassword.jsp");
				dis.forward(request, response);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package system.model.webcontrol;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import system.model.database.ProcessWithDatabase;

/**
 * Servlet implementation class EmpRegisterServlet
 */
@WebServlet("/EmpRegisterServlet")
public class EmpRegisterServlet extends HttpServlet {
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
		
		System.out.println("Hello from post ");
		
		String name = request.getParameter("EmpName");
		String email = request.getParameter("EmpEmail");
		String mobile = request.getParameter("EmpMobile");
		String password = request.getParameter("EmpPassword");
		
		try {
			boolean status = processdata.AddNewEmployee(name, email, mobile, password);
			if(status==true)
			{
		
				response.sendRedirect("EmpDashboard.jsp");
			}
			else
			{
				response.sendRedirect("EmpLogin.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

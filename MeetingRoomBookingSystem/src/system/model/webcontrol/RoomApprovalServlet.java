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
 * Servlet implementation class RoomApprovalServlet
 */
@WebServlet("/RoomApprovalServlet")
public class RoomApprovalServlet extends HttpServlet {
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello from post in confirmation");
		String value = request.getParameter("buttonPressed");
		String requestId = request.getParameter("requestId"); 
		System.out.println(value+requestId);
		
		try {
			int status = processdata.RoomApproval(value, requestId);
			if(status==1)
			{
		
				System.out.print("Checked");
				response.sendRedirect("AdminConfirmation.jsp");
			}
			else
			{
				response.sendRedirect("AdminConfirmation.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

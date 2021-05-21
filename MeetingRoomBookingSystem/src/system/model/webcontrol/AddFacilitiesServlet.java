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
 * Servlet implementation class AddFacilitiesServlet
 */
@WebServlet("/AddFacilitiesServlet")
public class AddFacilitiesServlet extends HttpServlet {
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
		
		System.out.println("Hello from post in add facilities ");
		
		String FacilityName = request.getParameter("AddFacility");
		
		try {
			int x = processdata.AddFacilityToRoom(FacilityName);;
			if(x==1)
			{
		
				response.sendRedirect("AdminHomePage.jsp");
			}
			else
			{
				response.sendRedirect("AdminAddFacilities.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}

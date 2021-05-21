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
 * Servlet implementation class AddMeetingRoomServlet
 */
@WebServlet("/AddMeetingRoomServlet")
public class AddMeetingRoomServlet extends HttpServlet {
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
		
		System.out.println("Hello from post addMeeting");
		
		String roomDes = request.getParameter("RoomDescription");
		String roomType = request.getParameter("roomtype");
		
		try {
			int status = processdata.AddMeetingRoom(roomType);
			if(status==1)
			{
		
				response.sendRedirect("AdminHomePage.jsp");
			}
			else
			{
				response.sendRedirect("AdminAddRoom.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

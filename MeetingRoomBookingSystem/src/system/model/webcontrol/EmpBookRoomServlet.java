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
 * Servlet implementation class EmpBookRoomServlet
 */
@WebServlet("/EmpBookRoomServlet")
public class EmpBookRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProcessWithDatabase processdata;
	EmpGetRoomId RoomId;
	 

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		processdata = new ProcessWithDatabase();
		RoomId = new EmpGetRoomId();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello from post ");
		
		String Date = request.getParameter("Date");
		String InTime = request.getParameter("InTime");
		String OutTime = request.getParameter("OutTime");
		String attendies = request.getParameter("Attendies");
		String id = RoomId.roomId;
		
		try {
			  System.out.println("111111");
			boolean statusOfMachingData = processdata.checkAvailability(Date,id,InTime,OutTime);
			  System.out.println("2222222");
			if(statusOfMachingData==true)
			{
				  System.out.println("33333");
				int status = processdata.BookRoom(id, Date, InTime, OutTime, attendies);
				if(status==1)
				{
			
					response.sendRedirect("EmpHomePage.jsp");
				}
				else
				{
					response.sendRedirect("EmpBookRoom.jsp");
				}
			}
			else
			{
				response.sendRedirect("EmpBookRoom.jsp");
			}
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

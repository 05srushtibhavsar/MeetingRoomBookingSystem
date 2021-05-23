package system.model.webcontrol;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import system.model.database.ProcessWithDatabase;

/**
 * Servlet implementation class EmpGetRoomId
 */
@WebServlet("/EmpGetRoomId")
public class EmpGetRoomId extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProcessWithDatabase processdata;
	public static String roomId;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		processdata = new ProcessWithDatabase();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Hello from get ");
		
		String id = request.getParameter("roomId");
		
		roomId=id;
		System.out.println(id);
		
		response.sendRedirect("EmpBookRoom.jsp");
		
	}

}

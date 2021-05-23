package system.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.*;

import system.model.bean.AdminInfo;
import system.model.bean.DatabaseDetails;
import system.model.bean.EmployeesInfo;
import system.model.bean.MeetingDetails;

public class ProcessWithDatabase {
	
	DatabaseDetails details;
	public static AdminInfo adminInfo;
	public static EmployeesInfo empInfo;
	public static MeetingDetails meetingDetails;
	//This method for validating adminLogin and return true if credentials are valid otherwise return false
	
	public boolean validateAdminLogin(String mobile, String password) throws SQLException, ClassNotFoundException
	{
		System.out.println(mobile+password);
		boolean status = false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
		Statement st=con.createStatement();

		String query="select* from admin where admin_mobile='"+mobile+"' and admin_password='"+password+"'";
		ResultSet rs=st.executeQuery(query);
		
		
	
		status = rs.next();
		if(status)
		{
			System.out.print(rs.getString(2));
			adminInfo = new AdminInfo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			
		}
		
		return status;
	}

	//This method for validating employeesLogin and return true if credentials are valid otherwise return false
	
	public boolean validateEmployeesLogin(String mobile, String password) throws SQLException, ClassNotFoundException
	{
		System.out.println(mobile+password);
		boolean status = false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
		Statement st=con.createStatement();

		String query="select* from employees where emp_mobile='"+mobile+"' and emp_password='"+password+"'";
		ResultSet rs=st.executeQuery(query);
		
		
		
		status = rs.next();
		if(status)
		{
			System.out.print(rs.getString(2));
			empInfo = new EmployeesInfo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			
		}
		
		return status;
	}
	
	//This Method will change admin password
	
	public boolean changeAdminPassword(String oldPass, String newPass) throws ClassNotFoundException, SQLException
	{
		System.out.println(oldPass+newPass);
		boolean status = false;

		if(adminInfo.getAdmin_password().equals(oldPass))
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
			Statement st=con.createStatement();
			String query="update admin set admin_password='"+newPass+"' where admin_id='"+adminInfo.getAdmin_id()+"'";
			int rs=st.executeUpdate(query);
			status = true;
		}
		
		return status;
	}

	
	//This Method will change Employee password and return true is successfully changed otherwise false
	
		public boolean changeEmpPassword(String oldPass, String newPass) throws ClassNotFoundException, SQLException
		{
			System.out.println(oldPass+newPass);
			boolean status = false;

			if(empInfo.getEmp_password().equals(oldPass))
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
				Statement st=con.createStatement();
				String query="update employees set emp_password='"+newPass+"' where emp_id='"+empInfo.getEmp_id()+"'";
				int rs=st.executeUpdate(query);
				status = true;
			}
			
			return status;
		}
	
	
	//This method will return all available facilities in database in the form of arraylist
	public ArrayList<String> AvailableFacilities() throws ClassNotFoundException, SQLException
	{
		
		System.out.print("In AvailableFacilities");
		ArrayList<String> availableFacilities = new ArrayList<String>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
		Statement st=con.createStatement();
		String query="select fac_name from availablefacilities";
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			availableFacilities.add(rs.getString(1));
		}
		
		System.out.print("In added");
		return availableFacilities;
		
	}
	
	//This method will add facility to meeting rooms and return 1 if added correctly otherwise 0
	
	public int AddFacilityToRoom(String FacilityName) throws ClassNotFoundException, SQLException
	{
		System.out.print("In AddFacilities");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
		Statement st=con.createStatement();
		String query="insert into availablefacilities value(fac_id,'"+FacilityName+"');";
		int rs=st.executeUpdate(query);
		if(rs==1)
		{
			return 1;
		}
		System.out.print("rs");
		return 0;
	
	}
	
	//This method will return all available rooms in system in database in the form of hashtable(meetingRoomId, roomType
	public Hashtable<String,String> AvailableMeetingRooms() throws ClassNotFoundException, SQLException
	{
		
		System.out.print("In AvailableFacilities");
		Hashtable<String,String> availablerooms = new Hashtable<String,String>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
		Statement st=con.createStatement();
		String query="select * from AllMeetingRooms";
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			availablerooms.put(rs.getString(1),rs.getString(2));
		}
		
		System.out.print("In added");
		return availablerooms;
		
	}
	
	//This method will add room and return 1 if added correctly otherwise 0
		
	public int AddMeetingRoom(String roomType) throws ClassNotFoundException, SQLException
	{
		System.out.print("In addRooms");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
		Statement st=con.createStatement();
		String query="insert into AllMeetingRooms value(meetingRoomId,'"+roomType+"');";
		int rs=st.executeUpdate(query);
	
		System.out.print("In added");
		return rs;
	
	}
	
	//This method will add new user to system and store its details and return true is successfully stored otherwise false
	public boolean AddNewEmployee(String name, String email, String mobile, String password) throws ClassNotFoundException, SQLException
	{
	
		System.out.print(name+email+mobile+password);
		System.out.print("11111");
		boolean status = false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
		Statement st=con.createStatement();
		System.out.print("555555");
		String query="insert into employees value(emp_id,'"+name+"','"+email+"','"+mobile+"','"+password+"')";
		System.out.print("6666");
		int res=st.executeUpdate(query);
		System.out.print("7777");
		
		query="select emp_id from employees where emp_mobile= '"+mobile+"';";
		
		ResultSet rs=st.executeQuery(query);
		
		status = rs.next();
		int id = rs.getInt(1);
		
		empInfo = new EmployeesInfo(id,name, email, mobile, password);
		
		System.out.print("In added");
		return status;
	
	}
	
	//This method will book room and returns 1 if room is booked successfully otherwise return 0
	public int BookRoom(String roomId, String date, String inTime, String outTime, String attendies) throws ClassNotFoundException, SQLException
	{
		
		int id = Integer.parseInt(roomId);
		int empId = empInfo.getEmp_id();
		int attendi = Integer.parseInt(attendies);
		System.out.print("11111");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
		Statement st=con.createStatement();
		System.out.print("555555");
		String query="insert into bookedroom value(cart_id,'"+empId+"','"+id+"','"+date+"','"+inTime+"','"+outTime+"','"+attendi+"',0)";
		System.out.print("6666");
		int res=st.executeUpdate(query);
		System.out.print("7777");
		return res;
		
	}
	
	
	public ArrayList<MeetingDetails> MeetingRoomsrequested() throws ClassNotFoundException, SQLException
	{
		System.out.println("7777");
		ArrayList<MeetingDetails> meet = new ArrayList<>();
		boolean status = false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
		Statement st=con.createStatement();

		String query=" select * from bookedroom inner join allmeetingrooms on allmeetingrooms.meetingRoomId=bookedroom.meetingRoomId where admin_id='"+0+"';";
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1));
			meetingDetails = new MeetingDetails(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getString(10));
			meet.add(meetingDetails);
			
		}
		return meet;
	}
	
	public ArrayList<MeetingDetails> MeetingRoomsHistory() throws ClassNotFoundException, SQLException
	{
		System.out.println("7777");
		ArrayList<MeetingDetails> meet = new ArrayList<>();
		boolean status = false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
		Statement st=con.createStatement();

		String query=" select * from bookedroom inner join allmeetingrooms on allmeetingrooms.meetingRoomId=bookedroom.meetingRoomId;";
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1));
			meetingDetails = new MeetingDetails(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getString(10));
			meet.add(meetingDetails);
			
		}
		return meet;
	}
	
	public ArrayList<MeetingDetails> EmpBookedRoomHistory() throws ClassNotFoundException, SQLException
	{
		System.out.println("7777");
		ArrayList<MeetingDetails> meet = new ArrayList<>();
		boolean status = false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
		Statement st=con.createStatement();

		String query=" select * from bookedroom inner join allmeetingrooms on allmeetingrooms.meetingRoomId=bookedroom.meetingRoomId where emp_id='"+empInfo.getEmp_id()+"';";
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1));
			meetingDetails = new MeetingDetails(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getString(10));
			meet.add(meetingDetails);
			
		}
		return meet;
	}
	
	
	//This method update roomApproval value to -1 if request to room is rejected otherwise update to admin who approved this request
	public int RoomApproval(String name, String requestId) throws ClassNotFoundException, SQLException
	{
		int rs=0;
		if(name.equals("Accept"))
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
			Statement st=con.createStatement();

			String query="update bookedroom set admin_id='"+adminInfo.getAdmin_id()+"' where cart_id='"+requestId+"';";
			rs=st.executeUpdate(query);
		}
		else if(name.equals("Reject"))
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
			Statement st=con.createStatement();

			String query="update bookedroom set admin_id=-1 where cart_id='"+requestId+"';";
			rs=st.executeUpdate(query);
		}
		return rs;
		
	}
	
	public boolean checkAvailability(String date, String id, String inTime, String outTime) throws ClassNotFoundException, SQLException
	{
		
		String in_time = inTime + ":00";
		String out_time = outTime + ":00";
		
	
		boolean Instatus = false;
		boolean Outstatus = false;
		
		
		System.out.println(in_time);
		System.out.print(out_time);
		
		System.out.print("^^^^^^^^");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(details.url, details.uname, details.pass);
		Statement st=con.createStatement();

		String query=" select * from bookedroom where admin_id!=-1;";
		ResultSet rs=st.executeQuery(query);
		
		
		while(rs.next())
		{
			if(date.equals(rs.getString(4)))
			{
				if(rs.getInt(3)==Integer.parseInt(id))
				{
					
					try {
					    String string1 = rs.getString(5)+":00";
					    Date time1 = new SimpleDateFormat("HH:mm:ss").parse(string1);
					    Calendar calendar1 = Calendar.getInstance();
					    calendar1.setTime(time1);
					    calendar1.add(Calendar.DATE, 1);


					    String string2 = rs.getString(6)+":00";
					    Date time2 = new SimpleDateFormat("HH:mm:ss").parse(string2);
					    Calendar calendar2 = Calendar.getInstance();
					    calendar2.setTime(time2);
					    calendar2.add(Calendar.DATE, 1);

					 
					    Date d = new SimpleDateFormat("HH:mm:ss").parse(in_time);
					    Calendar calendar3 = Calendar.getInstance();
					    calendar3.setTime(d);
					    calendar3.add(Calendar.DATE, 1);
					    
			
					    Date outT = new SimpleDateFormat("HH:mm:ss").parse(out_time);
					    Calendar calendar4 = Calendar.getInstance();
					    calendar4.setTime(outT);
					    calendar4.add(Calendar.DATE, 1);

					    Date x = calendar3.getTime();
					    Date y = calendar4.getTime();
					    
					    if (x.after(calendar1.getTime()) && x.before(calendar2.getTime())) {
					        //checkes whether the current time is between 14:49:00 and 20:11:13.
					        System.out.println(true);
					        System.out.println("***************");
					        Instatus = true;
					        
					    }
					    
					    if (y.after(calendar1.getTime()) && y.before(calendar2.getTime())) {
					        //checkes whether the current time is between 14:49:00 and 20:11:13.
					        System.out.println(true);
					        System.out.println("$$$$$$$$$");
					        Outstatus = true;
					        
					    }
					    
					} catch (ParseException e) {
					    e.printStackTrace();
					}

				}
			}
			
		}
		
		if( Instatus==false & Outstatus ==false)
		{
			  System.out.println("~~~~~~~~~~~");
			return true;
		}
		else
		{
			  System.out.println("(((((((((((((((");
			return false;
		}
		
	}
	
	
}

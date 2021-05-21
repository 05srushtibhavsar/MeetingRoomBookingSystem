package system.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;

import system.model.bean.AdminInfo;
import system.model.bean.DatabaseDetails;

public class ProcessWithDatabase {
	
	DatabaseDetails details;
	public static AdminInfo adminInfo;
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
	
	
	
}

package system.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import system.model.bean.DatabaseDetails;

public class ProcessWithDatabase {
	
	DatabaseDetails details;
	
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

}

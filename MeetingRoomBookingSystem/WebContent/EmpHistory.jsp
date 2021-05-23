<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="system.model.database.ProcessWithDatabase"
    import = "system.model.bean.MeetingDetails" import = "java.util.ArrayList"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Meeting Room Booking System</title>
        <link rel="stylesheet" type="text/css" href="CSS/AdminHistoryCss.css">
    </head>
    <body>
        <div class="table-container">
            <h1 class="heading">History</h1>
            <table class="table">
                <thead>
                    <tr>
                        <th>Meet Id</th>
                        <th>Room Id</th>
                        <th>Room Type</th>
                        <th>Date</th>
                        <th>In Time</th>
                        <th>Out Time</th>
                        <th>Attendees Count</th>
                        <th>Approval</th>
                    </tr>
                </thead>
                <tbody>
                
                <%
				
                String status ="Pending";
			ProcessWithDatabase process = new ProcessWithDatabase();
			ArrayList<MeetingDetails> meet = process.EmpBookedRoomHistory();
		
			
			for(int i=0;i<meet.size();i++)
			{
			%>
                
                    <tr>
                        <td data-label="Meet Id"><%=meet.get(i).getMeetingId() %></td>
                        <td data-label="Room Id"><%=meet.get(i).getMeetingRoomId() %></td>
                        <td data-label="Room Type"><%=meet.get(i).getMeetingRoomType() %></td>
                        <td data-label="Date"><%=meet.get(i).getMeetingDate() %></td>
                        <td data-label="In Time"><%=meet.get(i).getMeetingInTime() %></td>
                        <td data-label="Out Time"><%=meet.get(i).getMeetingOutTime() %> </td>
                        <td data-label="Attendees Count"><%=meet.get(i).getMeetingAttendies()%></td>
                        
                        <%if(meet.get(i).getAdminWhoApproved()==-1)
                        {
                        	status="Rejected";
                        }
                        else if(meet.get(i).getAdminWhoApproved()==0)
                        {
                        	status="Pending";
                        }
                        else
                        {
                        	status="Approved";
                        }
                        %>
                        <td data-label="Approval"><%=status %></td>
                    </tr>
             <%} %>

                </tbody>
            </table>
        </div>
    </body>
</html>
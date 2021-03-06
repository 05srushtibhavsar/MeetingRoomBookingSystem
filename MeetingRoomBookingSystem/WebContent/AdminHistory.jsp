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
                        <th>Sr.No.</th>
                        <th>Employee Id</th>
                        <th>Room Id</th>
                        <th>Date</th>
                        <th>In Time</th>
                        <th>Out Time</th>
                        <th>Attendees Count</th>
                        <th>Admin Id</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <tbody>
                
                <%
				
                String status ="Pending";
			ProcessWithDatabase process = new ProcessWithDatabase();
			ArrayList<MeetingDetails> meet = process.MeetingRoomsHistory();
			
			for(int i=0;i<meet.size();i++)
			{
			%>
                
                    <tr>
                        <td data-label="Sr.No."><%=meet.get(i).getMeetingId() %></td>
                        <td data-label="Employee Id"><%=meet.get(i).getEmpId() %></td>
                        <td data-label="Room Id"><%=meet.get(i).getMeetingRoomId() %></td>
                        <td data-label="Date"><%=meet.get(i).getMeetingDate() %></td>
                        <td data-label="In Time"><%=meet.get(i).getMeetingInTime() %></td>
                        <td data-label="Out Time"><%=meet.get(i).getMeetingOutTime() %> </td>
                        <td data-label="Attendees Count"><%=meet.get(i).getMeetingAttendies()%></td>
                        <td data-label="Admin Id"><%=meet.get(i).getAdminWhoApproved() %></td>

                        
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
                        <td data-label="Status"><%=status %></td>
                        
                    </tr>
             <%} %>

                </tbody>
            </table>
        </div>
    </body>
</html>
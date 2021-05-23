<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="system.model.database.ProcessWithDatabase"
    import = "system.model.bean.MeetingDetails" import = "java.util.ArrayList"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>Confirmations</title>
		<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
			crossorigin="anonymous"
		/>
	</head>
	<body class="bg-light text-dark">
	
		<div class="container">
			<h1 class="text-center my-3">Requests for Roooms</h1>
			
			
			
			
			<%
			System.out.println("In ###########");	
			ProcessWithDatabase process = new ProcessWithDatabase();
			ArrayList<MeetingDetails> meet = process.MeetingRoomsrequested();%>
			
			<form action="RoomApprovalServlet" method="get">
			<%
			for(int i=0;i<meet.size();i++)
			{
				System.out.println("In $$$$$$$$");	
			%>
				
			<div class="row">
				<div class="col-md-6">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">
								User Name & ID of Requester
							</h5>
						
							<p class="card-text h6">Request Id: <%=meet.get(i).getMeetingId() %></p>
							<p class="card-text h6">Employee Id: <%=meet.get(i).getEmpId() %></p>
							<p class="card-text h6">Requested Room : <%=meet.get(i).getMeetingRoomId() %></p>
							<p class="card-text h6">Date : <%=meet.get(i).getMeetingDate() %></p>
							<p class="card-text h6">From : <%=meet.get(i).getMeetingInTime() %></p>
							<p class="card-text h6">To : <%=meet.get(i).getMeetingOutTime() %></p>
							<p class="card-text h6">Attendees : <%=meet.get(i).getMeetingAttendies() %></p>
							
						
						
							<button class="btn btn-outline-danger" name="buttonPressed" value="Accept">Accept<br></button>
							<button class="btn btn-outline-danger" name="buttonPressed" value="Reject">Reject<br></button>
          	
							<input type="hidden" name="requestId" value=<%=meet.get(i).getMeetingId() %>>
						</div>
					</div>
				</div>
				</div>
				
			<%} %>
			</form>
			
			
			
		</div>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
			crossorigin="anonymous"
		></script>
	</body>
</html>

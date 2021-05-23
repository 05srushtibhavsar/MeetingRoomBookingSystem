<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="system.model.database.ProcessWithDatabase" import = "java.util.ArrayList" 
    import="java.util.Hashtable" import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MeetingRooms</title>
    <link rel="stylesheet" type="text/css" href="CSS/EmpMeetingRoomsHomePageCss.css">
<body>

    <h1>Rooms</h1>
    <div class ="dashboardLink">
        <a href="EmpHomePage.jsp" >Dashboard</a><br>
    </div>

     <div class="meetingRoombox">
        <div class="container">
        
            <a href="EmpBookRoom.jsp">
            
            <form action="EmpGetRoomId" method="get">
            <%
            
            int x=1;
            ProcessWithDatabase process = new ProcessWithDatabase();
            Hashtable<String,String> availablerooms = process.AvailableMeetingRooms();
            Enumeration<String> enu = availablerooms.keys();
           while(enu.hasMoreElements())
            {
            	
            	String name =enu.nextElement();
            	
           %>
          	<button class="btn btn1" name="roomId" value=<%=name %>>Meeting Room <%=name %><br><%=availablerooms.get(name) %></button>
          	
           <%
       
	           if(x>3)
	           {
	        	  x=1;
	       	%><br>
	       	<%
	        	  
	          	}
           }
           %>
           
        
          </a>
          </form>
        
        </div>
       
         
    </div>
</body>
</head>
</html>
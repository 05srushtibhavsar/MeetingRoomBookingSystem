<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="system.model.database.ProcessWithDatabase" import = "java.util.ArrayList" 
    import="java.util.Hashtable" import="java.util.Enumeration"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Facilities</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/AdminAddFacilitiesCss.css">
	 <script type="text/javascript" src="JS/AdminLoginJS.js"></script>
<body>

    <div class ="dashboardLink">
        <a href="AdminHomePage.html" >Dashboard</a><br>
    </div>
    
    <div class="loginbox">
        <h1>Add Facilities</h1>
        
         <br>
         <div class="dropdown">
            <p>Available meeting rooms</p>
            
            <div class="dropdown-select">
                <span class="select">Available meeting rooms</span>
                <i class="fa fa-caret-down icon"></i>
            </div>
            <div class="dropdown-list">
            
            <%
            
            ProcessWithDatabase process = new ProcessWithDatabase();
            Hashtable<String,String> availablerooms = process.AvailableMeetingRooms();
            Enumeration<String> enu = availablerooms.keys();
           while(enu.hasMoreElements())
            {
            	
            	String name =enu.nextElement();
            	
           %>
          	 <div class="dropdown-list_item">Meeting Room <%=name %></div>
           <%
       
           }
           %>
            </div>
        
            
        </div>
            
        
            <br><br><br>
         <div class="dropdown">
            <p>Aleady available facilities in meeting room</p>
            
            <div class="dropdown-select">
                <span class="select">Available facilities</span>
                <i class="fa fa-caret-down icon"></i>
            </div>
            <div class="dropdown-list">
            
            <%
            
           // ProcessWithDatabase process = new ProcessWithDatabase();
            ArrayList<String> availableFacilities = process.AvailableFacilities();
            for(int i=0;i<availableFacilities.size();i++)
            {
            	System.out.print(availableFacilities.get(i));
            	String name = availableFacilities.get(i);
            	
           %>
           <div class="dropdown-list_item"><%=name %></div>
           <%
       
           }
           %>
            
         </div>
        
            
        </div>
        <br><br>
        <form action= "AddFacilitiesServlet" method="post" name = "addfacility">
            
                <p>Add facility</p>
                <input type="text" name = "AddFacility" placeholder="Enter facility"><br><br>
                <input type="submit" name = "sub" value="Add" onClick = "return adminAddFacility(); "><br><br>
            </form>
         <div style="color:red">${errorMessage}</div>
    </div>
</body>
</html>
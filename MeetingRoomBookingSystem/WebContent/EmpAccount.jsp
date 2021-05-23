<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="system.model.database.ProcessWithDatabase"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Meeting Room Booking</title>
    <link rel="stylesheet" href="CSS/EmpAccountCss.css">
  </head>
  <body>
      
      <div class="box">
   <h1>My Account</h1>
   ID: <input type="text" disabled value= <%=ProcessWithDatabase.empInfo.getEmp_id() %>>
   <br><br><br>
   Name: <input type="text" disabled value= <%=ProcessWithDatabase.empInfo.getEmp_name() %>>
   <br><br><br>
   Email Id: <input type="text" disabled value= <%=ProcessWithDatabase.empInfo.getEmp_email() %>>
   <br><br><br>
   Mobile:<input type="text" disabled value= <%=ProcessWithDatabase.empInfo.getEmp_mobile() %>>
    <br>
    
    </div>
  </body>
</html>
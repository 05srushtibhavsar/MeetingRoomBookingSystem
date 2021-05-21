<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="system.model.database.ProcessWithDatabase"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Meeting Room Booking</title>
    <link rel="stylesheet" href="CSS/AdminAccountCss.css">
  </head>
  <body>
   
   <h1>My Account</h1>
   ID: <input type="text" value=<%=ProcessWithDatabase.adminInfo.getAdmin_id() %>>
   <br>
   Name: <input type="text" value=<%=ProcessWithDatabase.adminInfo.getAdmin_name() %>>
    <br>
   Email Id: <input type="text" value=<%=ProcessWithDatabase.adminInfo.getAdmin_email() %>>
    <br>
   Mobile: <input type="text" value=<%=ProcessWithDatabase.adminInfo.getAdmin_mobile() %>>
    <br>
   
  </body>
</html>
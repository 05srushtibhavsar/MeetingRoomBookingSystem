<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HTML CSS Register Form</title>
    <link rel="stylesheet" href="CSS/EmpRegisterCss.css">
  </head>
  <body>
  <div class="box">
   <img src="avatar4.webp" class="avatar">
   <h1>Register</h1>
    <form action="EmpRegisterServlet" method="post" class="signup-form">
   
   Name:<br> <input type="text" name="EmpName"  placeholder = "Enter Name">
    <br><br>
   Email Id: <br><input type="text" name="EmpEmail"  placeholder = "Enter Email Id">
    <br><br>
   Mobile:<br> <input type="text" name="EmpMobile"  placeholder = "Enter Mobile Number">
    <br><br>
   Password:<br> <input type="password" name="EmpPassword"  placeholder = "Enter Password">
    <br><br><br>
   <input type ="submit" value = "Login"><br><br>
   
  <a href="EmpLogin.jsp" >Already have an account?</a><br>
 
    </form>
     </div>
  </body>
</html>
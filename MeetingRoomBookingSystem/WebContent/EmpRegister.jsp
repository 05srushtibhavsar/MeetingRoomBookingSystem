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
    <form action="EmpRegisterServlet" method="post" class="signup-form">
      <div class="form-header">
        <h1>Register</h1>
      </div>


      <div class="form-body">
      <h1>My Account</h1>
  
   Name: <input type="text" value="EmpName"  placeholder = "Enter Name">
    <br>
   Email Id: <input type="text" value="EmpEmail"  placeholder = "Enter Email Id">
    <br>
   Mobile: <input type="text" value="EmpMobile"  placeholder = "Enter Mobile Number">
    <br>
   Password: <input type="text" value="EmpPassword"  placeholder = "Enter Password">
    <br>
   <input type ="submit" value = "Login"><br><br>
   
  <a href="Login.html" >Already have an account?</a><br>
    </form>
  </body>
</html>
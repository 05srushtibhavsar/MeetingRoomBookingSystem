<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
    <link rel="stylesheet" type="text/css" href="CSS/EmpLoginCss.css">
    <script type="text/javascript" src="JS/AdminLoginJS.js"></script>
<body>

    <div class="loginbox">
    <img src="avatar4.webp" class="avatar">
        <h1> Login Here</h1>
        <form action = "EmpLoginServlet" method="post" name="EmpLogin">
        
            <p>Mobile Number</p>
            <input type = "number" name = "Mobile" placeholder = "Enter Mobile Number">
            <p>Password</p>
            <input type = "password" name = "Password" placeholder = "Enter Password">
            <br><br><br>
            <input type ="submit" value = "Login" onClick = "return EmpLoginValidate(); "><br><br>
            	
            <a href = "EmpRegister.jsp" >Do not have an account?</a><br><br>
            
        </form>
         
         <div style="color:red">${errorMessage}</div>
    </div>
</body>
</html>
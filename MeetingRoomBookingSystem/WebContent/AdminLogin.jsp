<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/AdminLogin.css">
    <script type="text/javascript" src="JS/AdminLoginJS.js"></script>
<body>

    <div class="loginbox">
    <img src="avatar4.webp" class="avatar">
        <h1> Admin Login Here</h1>
        <form action = "AdminLoginpage" method="post" name="adminLogin">
        
            <p>Mobile Number</p>
            <input type = "number" name = "Mobile" placeholder = "Enter Mobile Number">
            <p>Password</p>
            <input type = "password" name = "Password" placeholder = "Enter Password">
            <br><br><br>
            <input type ="submit" value = "Login" onClick = "return adminLoginValidate(); "><br><br>
            	
            <a href = "#" >Forgot Password?</a><br>
        
            
        </form>
         
    </div>
</body>
</html>
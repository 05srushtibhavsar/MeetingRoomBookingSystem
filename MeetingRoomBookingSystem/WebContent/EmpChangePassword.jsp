<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Meeting Room Booking</title>
        <link rel="stylesheet" type="text/css" href="CSS/EmpChangePasswordCss.css">
    </head>
    <body>
        <div class="form">
        <p>Change Password</p>
        <form action="EmpChangePasswordServlet" method="post">
            <input type="password" name="Old_Password"  placeholder="Old Password"  required="required">
            <input type="password" name="New_Password"  placeholder="New Password"  required="required">
            <input type="password" name="Confirm_Password"  placeholder="Confirm Password"  required="required">
            <button>Change Password</button>
            </form>
            <br>
             <div style="color:red">${errorMessage}</div>
        </div>
    </body>
</html>
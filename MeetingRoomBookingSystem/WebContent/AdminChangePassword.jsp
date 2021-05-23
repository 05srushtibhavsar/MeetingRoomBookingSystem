<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Meeting Room Booking</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/AdminChangePasswordCss.css">
    </head>
    <body>
        <div class="form">
        <p>Change Password</p>
        <form action="ChangePasswordServlet" method="post">
            <input type="password" name="OldPassword"  placeholder="Old Password"  required="required">
            <input type="password" name="NewPassword"  placeholder="New Password"  required="required">
            <input type="password" name="ConfirmPassword"  placeholder="Confirm Password"  required="required">
            <button>Change Password</button>
            </form>
        </div>
    </body>
</html>
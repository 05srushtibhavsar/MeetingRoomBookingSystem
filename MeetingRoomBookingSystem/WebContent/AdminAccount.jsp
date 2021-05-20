<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Meeting Room Booking</title>
    <link rel="stylesheet" href="CSS/AdminAccountCss.css">
  </head>
  <body>
    <form class="signup-form">
      <div class="form-header">
        <h1>My Account</h1>
      </div>


      <div class="form-body">


        <div class="horizontal-group">
          <div class="form-group left">
            <label for="firstname" class="label-title">First name </label>
            <input type="text" id="firstname" class="form-input" value="sjns" placeholder="enter your first name" required="required" />
          </div>
          <div class="form-group right">
            <label for="lastname" class="label-title">Last name</label>
            <input type="text" id="lastname" class="form-input" value="jsdgjs" placeholder="enter your last name" />
          </div>
        </div>
        

        <div class="horizontal-group">
          <div class="form-group left">
            <label for="gender" class="label-title">Gender </label>
            <input type="text" id="gender" class="form-input" value="male" placeholder="gender" required="required" />
          </div>
          <div class="form-group right">
            <label for="dob" class="label-title">Date of Birth</label>
            <input type="date" id="dob" class="form-input" value="01-Jan-2001" placeholder="date of birth" required="required" />
          </div>
        </div>


        <div class= "form-group">
          <label for="email" class="label-title">Email</label>
          <input type="email" id="email" class="form-input" value="123@gmail.com" placeholder="enter your email" required="required">
        </div>


        <div class="horizontal-group">
          <div class="form-group left">
            <label for="nationality" class="label-title">Nationality </label>
            <input type="text" id="nationality" class="form-input" value="Indian" placeholder="nationality" required="required" />
          </div>
          <div class="form-group right">
            <label for="mobile" class="label-title">Mobile</label>
            <input type="number" id="mobile" class="form-input" value="45678912345" placeholder="mobile" required="required"  />
          </div>
          </div>


        <div class="horizontal-group">
        
          <div class="form-group left">
            <label for="experience" class="label-title">Age</label>
            <input type="number" min="18" max="80" value="20" class="form-input" required="required">
          </div>
        </div>

    </form>
  </body>
</html>
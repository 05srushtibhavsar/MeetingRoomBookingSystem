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
    <form class="signup-form">
      <div class="form-header">
        <h1>Register</h1>
      </div>


      <div class="form-body">


        <div class="horizontal-group">
          <div class="form-group left">
            <label for="firstname" class="label-title">First name *</label>
            <input type="text" id="firstname" class="form-input" placeholder="enter your first name" required="required" />
          </div>
          <div class="form-group right">
            <label for="lastname" class="label-title">Last name</label>
            <input type="text" id="lastname" class="form-input" placeholder="enter your last name" />
          </div>
        </div>


        <div class="form-group">
          <label for="email" class="label-title">Email*</label>
          <input type="email" id="email" class="form-input" placeholder="enter your email" required="required">
        </div>

        <div class="horizontal-group">
          <div class="form-group left">
            <label for="password" class="label-title">Password *</label>
            <input type="password" id="password" class="form-input" placeholder="enter your password" required="required">
          </div>
          <div class="form-group right">
            <label for="confirm-password" class="label-title">Confirm Password *</label>
            <input type="password" class="form-input" id="confirm-password" placeholder="enter your password again" required="required">
          </div>
        </div>
          
          <div class="horizontal-group">
          <div class="form-group left">
            <label for="dateofbirth" class="label-title">Date of Birth *</label>
            <input type="number" id="dateofbirth" class="form-input" placeholder="enter your date of birth" required="required">
          </div>
          <div class="form-group right">
            <label for="mobile" class="label-title">Mobile Number *</label>
            <input type="mobile" class="form-input" id="confirm-mobile" placeholder="enter your mobile Number " required="required">
          </div>
        </div>

        <div class="horizontal-group">
          <div class="form-group left" >
            <label for="choose-file" class="label-title">Upload Profile Picture</label>
            <input type="file" id="choose-file" size="80">
          </div>
          <div class="form-group right">
            <label for="experience" class="label-title">Age</label>
            <input type="number" min="18" max="80"  value="18" class="form-input">
          </div>
        </div>

      <div class="form-footer">
        <button type="submit" class="btn">Create</button>
      </div>
           <a href="Login.html" >Already have an account?</a><br>
    </form>
  </body>
</html>
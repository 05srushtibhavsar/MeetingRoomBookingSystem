<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="CSS/EmpBookRoomCss.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", Arial, Helvetica, sans-serif}
.mySlides {display: none}
</style>
<body class="content border-left border-right">
<nav class="sidebar light-grey collapse top" style="z-index:3;width:260px" id="mySidebar">
  <div class="container display-container padding-16">
    <i onclick="w3_close()" class="fa fa-remove hide-large button transparent display-topright"></i>
    <h3>Book Room</h3>
    <hr>
    <form action="EmpBookRoomServlet" method="post" target="_blank">
      <p><label><i class="fa fa-calendar-check-o"></i>Day</label></p>
      <input class="input border" type="date" placeholder="DD MM YYYY" name="Date" required>          
      <p><label><i class="fa fa-calendar-o"></i> From</label></p>
      <input class="input border" type="time" placeholder="DD MM YYYY" name="InTime" required>
      <p><label><i class="fa fa-calendar-o"></i> To</label></p>
      <input class="input border" type="time" placeholder="DD MM YYYY" name="OutTime" required>         
      <p><label><i class="fa fa-male"></i>Attendies</label></p>
      <input class="input border" type="number" value="1" name="Attendies" min="1" max="6">              
      <p><button class="button block green left-align" type="submit" >Book</button></p>
    </form>
  </div>
  <!-- <div class="bar-block">
    <a href="#apartment" class="bar-item button padding-16"><i class="fa fa-building"></i> Apartment</a>
    <a href="javascript:void(0)" class="bar-item button padding-16" onclick="document.getElementById('subscribe').style.display='block'"><i class="fa fa-rss"></i> Subscribe</a>
    <a href="#contact" class="bar-item button padding-16"><i class="fa fa-envelope"></i> Contact</a>
  </div> -->
</nav>

<header class="bar top hide-large black xlarge">
  <span class="bar-item">Book Room</span>
  <a href="javascript:void(0)" class="right bar-item button" onclick="w3_open()"><i class="fa fa-bars"></i></a>
</header>

<div class="overlay hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<div class="main white" style="margin-left:260px">

  <div class="hide-large" style="margin-top:80px"></div>

  <div class="container" id="apartment">
    <h2 class="text-green">The Room</h2>
    <div class="display-container mySlides">
    <img src="./pic1.jpg" style="width:100%;margin-bottom:-6px">
      <div class="display-bottomleft container black">
        <p>Pic 1</p>
      </div>
    </div>
    <div class="display-container mySlides">
    <img src="./pic2.jpg" style="width:100%;margin-bottom:-6px">
      <div class="display-bottomleft container black">
        <p>Pic 2</p>
      </div>
    </div>
    <div class="display-container mySlides">
    <img src="./pic3.jpg" style="width:100%;margin-bottom:-6px">
      <div class="display-bottomleft container black">
        <p>Pic 3</p>
      </div>
    </div>
    <div class="display-container mySlides">
    <img src="./pic4.jpeg" style="width:100%;margin-bottom:-6px">
      <div class="display-bottomleft container black">
        <p>pic 4</p>
      </div>
    </div>
  </div>
  <div class="row-padding section">
    <div class="col s3">
      <img class="demo opacity hover-opacity-off" src="./pic1.jpg" style="width:100%;cursor:pointer" onclick="currentDiv(1)" title="Living room">
    </div>
    <div class="col s3">
      <img class="demo opacity hover-opacity-off" src="./pic2.jpg" style="width:100%;cursor:pointer" onclick="currentDiv(2)" title="Dining room">
    </div>
    <div class="col s3">
      <img class="demo opacity hover-opacity-off" src="./pic3.jpg" style="width:100%;cursor:pointer" onclick="currentDiv(3)" title="Bedroom">
    </div>
    <div class="col s3">
      <img class="demo opacity hover-opacity-off" src="./pic4.jpeg" style="width:100%;cursor:pointer" onclick="currentDiv(4)" title="Second Living Room">
    </div>
  </div>

  <div class="container">
    <hr>
    
    <h4><strong>Facilities</strong></h4>
    <div class="row large">
      <div class="col s6">
        <p><i class="fas fa-wind"></i> AC</p>
        <p><i class="fa fa-fw fa-wifi"></i> WiFi</p>
        <!-- <p><i class="fa fa-fw fa-tv"></i> TV</p> -->
      </div>
      <div class="col s6">
        <p><i class="fas fa-project-diagram"></i> Projector</p>
        <p><i class="fa fa-fw fa-tv"></i> TV</p>
        <!-- <p><i class="fa fa-fw fa-thermometer"></i> Heating</p> -->
        <!-- <p><i class="fa fa-fw fa-wheelchair"></i> Accessible</p> -->
      </div>
    </div>
    <hr>
    
    <h4><strong>Extra Info</strong></h4>
    <p> .</p>
    <hr>
    
    <h4><strong>Rules</strong></h4>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
    <p>Subscribe to receive updates on available dates and special offers.</p>
  </div>
  <hr>
</div>
<script>
// Script to open and close sidebar when on tablets and phones
function w3_open() {
  document.getElementById("mySidebar").style.display = "block";
  document.getElementById("myOverlay").style.display = "block";
}
 
function w3_close() {
  document.getElementById("mySidebar").style.display = "none";
  document.getElementById("myOverlay").style.display = "none";
}

// Slideshow Apartment Images
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function currentDiv(n) {
  showDivs(slideIndex = n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("demo");
  if (n > x.length) {slideIndex = 1}
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";
  }
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" opacity-off", "");
  }
  x[slideIndex-1].style.display = "block";
  dots[slideIndex-1].className += " opacity-off";
}
</script>

</body>
</html>
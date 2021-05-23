
//Valide admin login
function adminLoginValidate()
{

	var mobile = document.adminLogin.Mobile.value;
	var Password = document.adminLogin.Password.value;
	
	if(mobile=="")
	{
	alert("Please Enter Mobile Number");
	document.adminLogin.Mobile.focus();
	return false;
	}
	
	if(Password=="")
	{
	alert("Please Password");
	document.adminLogin.Password.focus();
	return false;
	}
	
	if(mobile.length!=10)
	{
	alert("Please Enter 10 digit Mobile Number only");
	document.adminLogin.Mobile.focus();
	return false;
	}

	//if((Password.length<5)||(Password.length>8))
	//{
	//alert("Please Enter Password length between 5 to 8 characters");
	//document.adminLogin.Password.focus();
	//return false;
	//}
	
}


//valide employee login
function EmpLoginValidate()
{

	var mobile = document.EmpLogin.Mobile.value;
	var Password = document.EmpLogin.Password.value;
	
	if(mobile=="")
	{
	alert("Please Enter Mobile Number");
	document.EmpLogin.Mobile.focus();
	return false;
	}
	
	if(Password=="")
	{
	alert("Please enter Password");
	document.EmpLogin.Password.focus();
	return false;
	}
	
	if(mobile.length!=10)
	{
	alert("Please Enter  10 digit Mobile Number only");
	document.EmpLogin.Mobile.focus();
	return false;
	}
	
	//if((Password.length<5)||(Password.length>8))
	//{
	//alert("Please Enter Password length between 5 to 8 characters");
	//document.EmpLogin.Password.focus();
	//return false;
	//}
}


//Adding new room to databse
function adminAddRooms()
{
	var type = document.adminAddRoom.roomtype.value;
	if(type=="")
	{
	alert("Please choose Room Type");
	document.adminAddRoom.roomtype.focus;
	return false;
	}
}


//Adding new facility to databse
function adminAddFacility()
{
	var name = document.addfacility.AddFacility.value;
	if(name=="")
	{
	alert("Please enter new facility name");
	document.addfacility.AddFacility.focus;
	return false;
	}
}


function EmpBookRoom()
{
	var date = document.EmpBooKRoom.Date.value;
	var inTime = document.EmpBooKRoom.InTime.value;
	var outTime = document.EmpBooKRoom.OutTime.value;
	var attendees = document.EmpBooKRoom.Attendees.value;
	
	if(date=="" || inTime=="" || outTime=="" || attendees=="")
	{
	alert("Please enter all fields");
	document.EmpBooKRoom.Date.focus;
	return false;
	}
	
}


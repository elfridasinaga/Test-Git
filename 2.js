function validation(username){
	var userRegex = /^[\W]{1},[a-z0-9]{2,12}$/;
	if(username.value.match(userRegex)){
	return true;
	}
	else{
		alert("Username Invalid");
	}	

function validation(password){
	var Regex = /^[0-9]{6,6}$/;
	if(password.value.match(Regex)){
	return true;
	}
	else{
		alert("Password Invalid");
	}
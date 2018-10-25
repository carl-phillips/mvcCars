
var exit = false;

function check() {
	var fn = document.forms["carForm"]["firstName"].value;
	var ln = document.forms["carForm"]["lastName"].value;
	var make = document.forms["carForm"]["make"].value;
	var model = document.forms["carForm"]["model"].value;
	var year = document.forms["carForm"]["year"].value;
	
	validate(fn);
	if(exit === true) {
		location.reload();
		return false;
	}
	validate(ln);
	if(exit === true) {
		location.reload();
		return false;
	}
	validate(make);
	if(exit === true) {
		location.reload();
		return false;
	}
	validateExpectNum(model);
	if(exit === true) {
		location.reload();
		return false;
	}
	validateNumber(year);
	if(exit === true) {
		location.reload();
		return false;
	}
}

function validate(str) {
	var hasFailed = false;
	hasFailed = validation(str);
	if (hasFailed === false) {
		exit = true;
	} else {
		return true;
	}
}

function validation(str) {
	if (str === "") {
		alert("All fields must be filled out");
		return false;
	} else if (hasNumber(str)) {
		return false;
	}
}

function validateExpectNum(str) {
	if (str === "") {
		alert("All fields must be filled out");
		return false;
	}
}

function hasNumber(str) {
	for (var i = 0; i < str.length; i++) {
		if(str.charAt(i) === "1" || str.charAt(i) === "2" || str.charAt(i) === "3" || str.charAt(i) === "4" || str.charAt(i) === "5" || str.charAt(i) === "6" || str.charAt(i) === "7" || str.charAt(i) === "8" || str.charAt(i) === "9" || str.charAt(i) === "0") {
			alert("Unexpected value at " + str.charAt(i));
			return true;
		}
	}
}

function validateNumber(str) {
	if (str == "0") {
		alert("Year must be filled out");
		location.reload();
		return false;
	} else if(str < "1900") {
		alert("Car year under 1900 is invalid")
		location.reload();
		return false;
	} else if(str > "2019") {
		alert("Car year over 2019 is invalid")
		location.reload();
		return false;
	}
}

alert("hello");

function check() {
	var fn = document.forms["carForm"]["firstName"].value;
	var ln = document.forms["carForm"]["lastName"].value;
	var make = document.forms["carForm"]["make"].value;
	var model = document.forms["carForm"]["model"].value;
	var year = document.forms["carForm"]["year"].value;
	
	validate(fn);
	validate(ln);
	validate(make);
	validate(model);
	validateNumber(year);
}

function validate(str) {
	var hasFailed = validation(str);
	if (hasFailed = false) {
		exit();
	} else {
		return true;
	}
}
function validation(str) {
	if (str == "") {
		alert("Name must be filled out");
		return false;
	} if (hasNumber(str)) {
		return false;
	}
}

function hasNumber(str) {
	for (var i = 0; i < str.length; i++) {
		if(str.charAt(i) === "1" || "2" || "3") {
			alert("Unexpected value at " + str.charAt(i));
			return true;
		}
	}
}

function validateNumber(str) {
	if (str == "0") {
		alert("Year must be filled out");
		return false;
	}
	if(str.length() > 4) {
		return false;
	}
}
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri= "http://www.springframework.org/tags/form" prefix="mvc" %>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
</head>
<body>
<h2>Buy Car Form</h2>
<mvc:form name="carForm" modelAttribute="car" action="result.mvc" onsubmit="return check()">
	<table>
	    <tr>
	        <td><mvc:label path="firstName">First Name</mvc:label></td>
	        <td><mvc:input path="firstName" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="lastName">Last Name</mvc:label></td>
	        <td><mvc:input path="lastName" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="make">Make</mvc:label></td>
	        <td><mvc:input path="make" /></td>
	    </tr>
   	    <tr>
	        <td><mvc:label path="model">Model</mvc:label></td>
	        <td><mvc:input path="model" /></td>
	    </tr>
		<tr>
            <td><mvc:label path="year">Year</mvc:label></td>
            <td><mvc:input path="year" /></td>
        </tr>
        <tr>
	        <td colspan="2">
                <input type="submit" value="Submit" />
	        </td>
	    </tr>
	</table>  
</mvc:form>
<a href = "viewAll.mvc">View all Cars</a>
</body>
<script src="validate.js"></script>
</html>
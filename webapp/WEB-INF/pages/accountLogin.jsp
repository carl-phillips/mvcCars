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
<h2>Login</h2>
<mvc:form name="accountLogin" modelAttribute="account" action="carForm.jsp" onsubmit="return check()">
	<table>
	    <tr>
	        <td><mvc:label path="username">Username</mvc:label></td>
	        <td><mvc:input path="username" /></td>
	    </tr>
	    <tr>
	    	<td><mvc:label path="password">Password</mvc:label></td>
	    	<td><mvc:input path="password" /></td>
	    </tr>
        <tr>
	        <td colspan="2">
                <input type="submit" value="Submit" />
	        </td>
	    </tr>
	    <tr>
	    	<td><a href="accountCreate">Create Account</a></td>
	    </tr>
	</table>  
</mvc:form>
<a href = "viewAll.mvc">View all Cars</a>
</body>
<script src="validate.js"></script>
</html>
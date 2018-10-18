<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC From Handling</title>
</head>
<body> <h2>User Registration Result</h2>
    <table>
        <tr>
            <td>First Name</td>
            <td>${c.firstName}</td>
        </tr>
        <tr>
            <td>Last name</td>
            <td>${c.lastname}</td>
        </tr>
        <tr>
            <td>ID</td>
            <td>${c.id}</td>
        </tr>
        <tr>
            <td>Make</td>
            <td>${c.make}</td>
        </tr>
        <tr>
            <td>Model</td>
            <td>${c.model}</td>
        </tr>
        <tr>
            <td>Year</td>
            <td>${c.year}</td>
        </tr>
        <tr>
            <td>Sold</td>
            <td>${c.carSold}</td>
        </tr>
        </table>
<a href = "viewAll.mvc">View all Cars</a>
</body>
</html>
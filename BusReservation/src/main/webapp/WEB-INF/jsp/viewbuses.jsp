
<%@page import="com.model.Users"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/mycss.css">

<title>Welcome</title>
</head>
<style>
body {
	background-color: #B0C4DE;text-align: center;
}
</style>
<body>



<form action="busdetails.jsp"><br><br><br>
Source:
<select name="cars">
  <option value=">Mumbai">Mumbai</option>
  <option value="Pune">Pune</option>
  <option value="Banglore">Banglore</option>
  <option value="Nasik">Nasik</option>
</select>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
Destination: 

<select name="cars">
  <option value=">Mumbai">Mumbai</option>
  <option value="Pune">Pune</option>
  <option value="Banglore">Banglore</option>
  <option value="Nasik">Nasik</option>
</select><br><br><br>
<input type="submit" value="Submit">
</form>








</body>
</html>
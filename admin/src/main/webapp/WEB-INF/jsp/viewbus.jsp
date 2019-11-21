
<%@page import="com.model.Bus"%>
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
<body>

<%-- 
<div class="topnav">
   <%@include file="usermenu.html" %>
</div>
 --%>


<div class="column side2">

<h3>Bus Details</h3>
<hr size="4" color="gray"/>


 <c:forEach items="${buslist}" var="bus">
      <div>
            <b>Bus_ID:<c:out value="${bus.bus_id}"/></b><br>
            <c:out value="${bus.bus_no}"/><br>  
           Bus_NO:<c:out value="${user.email}"/><br>  
           Number_of_Seats:<c:out value="${bus.no_of_seats}"/> <br>
            
           
            
            
       </div>
    </c:forEach> 
</div>
</div>




</body>
</html>
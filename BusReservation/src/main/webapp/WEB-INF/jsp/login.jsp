<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="login.do" modelAttribute="user" >
<table>
<tr>
<td>Email Id</td>
<td><input name="Email" type="text"/></td>
</tr>

<tr>
<td>Password</td>
<td><input name="Password" type="password"/></td>
</tr>

<tr>
<td colspan="2">
<input type="submit" value="submit"/>
</td>
</tr>
</table>
</form>
</body>
</html>
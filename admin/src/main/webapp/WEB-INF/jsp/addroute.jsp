<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form id="addRoute" modelAttribute="route" action="addroute.do" method="post">
       
              <center>
              <table>
              <tr>
              <td>Route_id:<br>
              <input type="text" name="route_id" id="route_id" />
              </td>
              </tr>
              
              <tr>
              <td>Source<br>
              <input type="text" name="source" id="source" />
              </td>
              </tr>
              
              <tr>
              <td>Destination<br>
              <input type="text" name="destination" id="destination" />
              </td>
              </tr>
              
               <tr>
              <td>Distance<br>
              <input type="text" name="distance" id="distance" />
              </td>
              </tr>
              
              <tr>
				<td></td>
				<td ><input type="submit" id="Add" name="Add" value="AddRoute"></td>
			</tr>
			</table>
</body>
</html>
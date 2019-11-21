<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

       <form id="addbus" modelAttribute="bus"  action="register.do"	method="post">
       
              <center>
              <table>
              <tr>
              <td>Bus_id:<br>
              <input type="text" name="bus_id" id="bus_id" />
              </td>
              </tr>
              
               <tr>
              <td>Bus_name:<br>
              <input type="text" name="bus_name" id="bus_name" />
              </td>
              </tr>
              
              <tr>
              <td>Bus_no:<br>
              <input type="text" name="bus_no" id="bus_no" />
              </td>
              </tr>
              
               <tr>
              <td>Bus_type:<br>
              <input type="text" name="bus_type" id="bus_type" />
              </td>
              </tr>
              
              <tr>
              <td>Number_of_seats:<br>
              <input type="text" name="no_of_seats" id="no_of_seats" />
              </td>
              </tr>
              
               <tr>
              <td>Fare:<br>
              <input type="text" name="fare" id="fare" />
              </td>
              </tr>
              
               <tr>
              <td>Departure_time:<br>
              <input type="text" name="departure_time" id="departure_time" />
              </td>
              </tr>
              
               <tr>
              <td>Arrival_time:<br>
              <input type="text" name="arrival_time" id="arrival_time" />
              </td>
              </tr>
              
              <tr>
              <td>Route_id:<br>
              <input type="text" name="route_id" id="route_id" />
              </td>
              </tr>

              <tr>
				<td></td>
				<td ><input type="submit" id="Add" name="Add" value="AddBus"></td>
			</tr>
              
            </table>
</body>
</html>
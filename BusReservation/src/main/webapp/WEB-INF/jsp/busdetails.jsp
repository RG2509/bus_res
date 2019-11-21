<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>busdetails</title>
</head>
<style>
body{
text-align: center;background-color:#B0C4DE;
}
</style>
<body>

  <a href="#">HOME</a>&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="viewbuses.do">VIEW BUSES</a>&nbsp;&nbsp;&nbsp;&nbsp;
  
  <a href="logout.do">LOGOUT</a>
  <h3>Bus Details</h3>
<hr size="4" color="gray"/>


 <c:forEach items="${buslist}" var="bus">
       <div>
            <b>Bus_id:<c:out value="${bus.bus_id}"/></b><br>
            <b>Bus_no:<c:out value="${bus.bus_no}"/> &nbsp; 
            <b>No_of_seats:<c:out value="${bus.no_of_seats}"/><br>  
       </div>
  
    </c:forEach> 
 <div class="footer">
  <p>Footer</p>
</div> 
 
</body>
</html>
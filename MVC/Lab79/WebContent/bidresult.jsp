<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<center>

	<table>
		<tr>
			<td>SID</td>
			<td>BID</td>
			<td>NAME</td>
			<td>PHONE</td>
			<td>EMAIL</td>
		</tr>
		
		<c:forEach var="student" items="${slist}">
			<tr>
			<td>${student.sid}</td>
			<td>${student.bid}</td>
			<td>${student.name}</td>
			<td>${student.phone}</td>
			<td>${student.email}</td>
		</tr>
		</c:forEach>
		
		
	</table>



</center>
</body>
</html>
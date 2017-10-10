<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MVC</title>
</head>
<body>
<h1 align="center">College Of Engineering And Technology</h1>
	
	<h1 align="center">This Is Employee</h1><br>
	<h1 align="center">This Is Employee</h1><br>
	<h1 align="center">This Is Employee</h1><br>
	<h1 align="center">This Is Employee</h1><br>
	<h1 align="center">This Is Employee</h1><br>
	<h1 align="center">This Is Employee</h1><br>
					
<h3>Welcome: ${pageContext.request.userPrincipal.name}</h3>
	
		<a href="<c:url value='/logout'/>">Logout</a>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">College Of Engineering And Technology</h1>

<h3 align="center">Welcome: ${pageContext.request.userPrincipal.name}</h3>
<h2 align="center">You are not authorized to access this page</h2>

<a href="<c:url value='logout.abhi'/>">Logout</a>
</body>
</html>
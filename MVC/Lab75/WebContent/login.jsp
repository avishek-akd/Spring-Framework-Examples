<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "f" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Login To CET</h1>
	
	<f:form action="verifyUser.abhi" method="post" commandName="user">
		
		<table>
			<tr>
				<td>Username:-</td>
				<td><f:input path="username" placeholder="Enter UserName"/></td>
				<td>
					<font color="red" size="4">
					
					<%-- you can use the <form:errors /> to render the
					 error messages that are associated with the “username” field. --%>
						
						<f:errors path="username"/>
					</font>
				</td>
			</tr>
			
			<tr>
				<td>Password:-</td>
				<td><f:password path="password" placeholder="Enter Password"/></td>
				<td>
					<font color="red" size="4">
						<f:errors path="password"/>
					</font>
				</td>
			</tr>
		</table>
		
		<br>
		
		<input type="submit" value="Login">
		
	</f:form>
	
	
</body>
</html>
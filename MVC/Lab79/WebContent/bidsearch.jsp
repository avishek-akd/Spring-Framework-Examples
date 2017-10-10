<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
   <%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "f" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<center>
	<f:form action="searchStudent.abhi" method="post" commandName="bidSearchCommand">
		
		<table>
		
			
			<tr>
				<td><fmt:message key="view.label.bid"/></td><br>
			</tr>
			
			
			<tr>
				<td><f:input path="bid"/></td>
				<td>
					<font color="red" size="4">
						<f:errors path="bid"/>
					</font>
				</td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Search"/></td>
			</tr>

		</table>	
	</f:form>
	
</center>	
</body>
</html>
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
<center>
	<f:form action="registerStudent.abhi" method="post" commandName="student">
		
		<table>
		
			<tr>
				<td align="center"><b><font color="green">College Of Engineering And Technology, Bhubaneswar</font></b></td>
			</tr>
			
			<tr>
				<td>StudentId:-</td>
				<td><f:input path="sid" placeholder="Enter Your Id"/></td>
				<td>
					<font color="red" size="4">
						<f:errors path="sid"/>
					</font>
				</td>
			</tr>
			
			<tr>
				<td>Name:-</td>
				<td><f:input path="sname" placeholder="Enter Your Name"/></td>
				<td>
					<font color="red" size="4">
						<f:errors path="sname"/>
					</font>
				</td>
			</tr>
			
			<tr>
				<td>EmailId:-</td>
				<td><f:input path="email" placeholder="Enter Your Email"/></td>
				<td>
					<font color="red" size="4">
						<f:errors path="email"/>
					</font>
				</td>
			</tr>
			
			<tr>
				<td>PhoneNo:-</td>
				<td><f:input path="phone" placeholder="Enter Your PhoneNo"/></td>
				<td>
					<font color="red" size="4">
						<f:errors path="phone"/>
					</font>
				</td>
			</tr>
			
			<tr>
				<td>Suitable Timings:-</td>
				<td>
					<f:checkbox path="timings" value="07.30 A.M-09.30 A.M"/>07.30 A.M-09.30 A.M<br>
					<f:checkbox path="timings" value="09.30 A.M-11.30 A.M"/>09.30 A.M-11.30 A.M<br>
					<f:checkbox path="timings" value="11.30 A.M-01.30 P.M"/>11.30 A.M-01.30 P.M<br>
					<f:checkbox path="timings" value="01.30 P.M-03.30 P.M"/>01.30 P.M-03.30 P.M<br>
					<f:checkbox path="timings" value="03.30 P.M-05.30 P.M"/>03.30 P.M-05.30 P.M<br>
				</td>
				<td>
					<font color="red" size="4">
						<f:errors path="timings"/>
					</font>
				</td>				
			</tr>
			
			<tr>
				<td>Gender:-</td>
				<td>
					<f:radiobutton path="gender" value="Male"/>Male<br>
					<f:radiobutton path="gender" value="Female"/>Female<br>
				</td>
				<td>
					<font color="red" size="4">
						<f:errors path="gender"/>
					</font>
				</td>				
			</tr>
			
			<tr>
				<td>Qualification:-</td>
				<td>
					<f:select path="qualification">
						<f:option value="...Select Options..."/>
						<f:option value="B.TECH"/>
						<f:option value="M.TECH"/>
						<f:option value="B.SC"/>
						<f:option value="B.C.A"/>
						<f:option value="M.C.A"/>
					</f:select>
				</td>
				<td>
					<font color="red" size="4">
						<f:errors path="qualification"/>
					</font>
				</td>
			</tr>
			
			<tr>
				<td>Remarks:-</td>
				<td>
					<f:textarea path="remarks" rows="5" cols="40"/>
				</td>
			</tr>
			
			<tr>
				<td align="center" colspan="7">
					<input type="submit" value="Register"/>
				</td>
			</tr>
			
		</table>
		
		<br>
		
	</f:form>
	
</center>	
</body>
</html>
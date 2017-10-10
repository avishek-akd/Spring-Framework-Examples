<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<center>
		<h3>
			<font color="red" size="6">
				${EMSG}
			</font>
		
		</h3>
		<form action="uploadfile.abhi" method="POST" enctype="multipart/form-data">
			Name:-<input type="text" name="name" /><br>
			File1:-<input type="file" name="file"/><br>
			File2:-<input type="file" name="file"/><br>
			File3:-<input type="file" name="file"/><br>
			
			<input type="submit" value="Upload"/>
		
		</form>
		
	</center>
	
</body>
</html>

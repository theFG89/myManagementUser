<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<h3>Login Form</h3><br><br>  
	<form action="loginProcess" method="post">
		Username:<input type="text" name="username"><br><br>
		Password:<input type="password" name="password"><br><br>
		Remember Me <input type="checkbox" name="remember" ><br><br>
		<input type="submit" value="login"/>
	 </form>  
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="j"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>CIAO Fabio22/12 12.18</h1>
	<br><br><br>
	<j:form action="welcome" method="POST" commandName="sendData">
	 Nome utente:<input type="text" name ="username"/><br><br>
	 Password: <input type="password" name="password"/><br><br>
	 <input type="submit" value ="Enter"/>
	</j:form>
	<a href="newuser">Clicca qui per creare nuova utenza</a>
</body>
</html>
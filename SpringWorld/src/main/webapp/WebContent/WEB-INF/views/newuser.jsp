<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="j"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Creazione nuova utenza</title>
</head>
<body>
<h1>Nuova Utenza</h1><br><br>
	<h3>${newnew}</h3>
 <j:form action="/SpringWorld/" method="post" commandName="save">
	New Username: <input type="text" name="username"/><br><br>
	New Password: <input type="password" name="password"/><br><br>
	<input type="submit" value="SALVA"/><br><br>
</j:form>
<a href="/SpringWorld/">Torna indietro</a>

	
</body>
</html>
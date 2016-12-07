<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista utenti</title>
</head>
<body>
	<h2>Utenti registrati</h2><br>
	<table>
	<tr>
		<th width=100>Nome</th>
		<th width=100>Cognome</th>
		<th width=100>Telefono</th>
	<tr>
	<c:forEach items="${user}" var="u">
		<tr>
			<td width=100>{u.name}</td> 
			<td width=100>{u.surname}</td>
			<td width=100>{u.telephone}</td>
			<td width=100><a href="">Modifica</a></td>
			<td width=100><a href="">Cancella</a></td>
		</tr>
	</c:forEach>
	 <br><br><a href="">Nuovo Utente</a>		<!-- <c:url value='/newuser' /> -->
		
	</table>
	
	

</body>
</html>
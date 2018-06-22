<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>USERNAME</td>
			<td>NOME</td>
			<td>COGNOME</td>
			<td>COMPLEANNO</td>
		</tr>
		<c:forEach var="lista" items="${listUtenti}">
			<tr>
				<td>${lista.username}</td>
				<td>${lista.nome}</td>
				<td>${lista.cognome}</td>
				<td>${lista.compleanno}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="index.html">Home</a>
</body>
</html>
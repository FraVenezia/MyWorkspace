<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Aggiungere Utenti</title>
</head>
<body>
	<form name="login" action="MiaServlet?op=AddUsr" method="POST">
		Nome Utente:<br> <input type="text" name="username"> <br>
		Password:<br> <input type="text" name="password"> <br>
		<br> <input id="btnSubmit" type="submit" value="Registra">
	</form>
	<h3><c:out value="${param.result}"></c:out></h3>
</body>
</html>
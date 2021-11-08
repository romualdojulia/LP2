<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Avaliacao 5 - Exercicio 1</title>
</head>
<%!
	public Integer abobora(){
		Random aleatorio = new Random();
		return aleatorio.nextInt(1001);
}

%>

<body>
	<h1>O número aleatório gerado foi: <%=abobora() %></h1>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Avaliacao 5 - Exercicio 3 </title>
</head>

<%
	for(int a=1; a<=7; a++){
		LocalDate data = LocalDate.now().minusDays(a);
		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
		String texto = data.format(formatters);
%>

<body>

	<table>
		<tr>
			<td> <%= texto %></td>
		</tr>
	<%
		} 
	%>
	</table>
</body>
</html>
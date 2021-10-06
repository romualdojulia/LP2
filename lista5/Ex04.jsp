<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Avaliacao 5 - Exercicio 4</title>
</head>
<body>
	<%  
		for(int i=10;i<=16;i+=2){ 
	%>
	<h3>Tabuada do <%= i %></h3>
	
	<table>
		<%
			for(int j=1; j<=10; j++){%>
		<tr>
			<td><%= i %></td>
			<td> X </td>
			<td> <%=j %></td>
			<td> =</td>
			<td><%= j*i %></td>
		</tr>
		<%
			}
		%>
	</table>
	<% 
		}
	%>
</body>
</html>
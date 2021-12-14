<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList" %>
<%@ page import="conteudos.Conteudo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ex04 - Listar</title>
</head>
<body>
	<h1>Lista de conteúdos: </h1>
	<table>
		<tr>
			<th>Assunto</th>
			<th>Mensagem</th>
		</tr>
		
		<% ArrayList<Conteudo> lista = (ArrayList<Conteudo>)session.getAttribute("lista");
		for(Conteudo conteudo : lista){ %>
			<tr>
				<td><%= conteudo.getAssunto() %></td>
				<td><%= conteudo.getMensagem() %> </td>
			</tr>
		<% }%>
	</table><br>
	
	<a href="index.jsp">Novo conteúdo</a>
</body>
</html>
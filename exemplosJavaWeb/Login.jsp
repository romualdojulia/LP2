<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login de Acesso</title>
</head>
<body>
	<form action="Resultado.jsp" method="get">
		<table>
			<tr>
				<td>Prontuario:</td>
				<td><input type="text" name="prontuario"></td> 
			<tr>
			<tr>
				<td>Senha:</td>
				<td><input type="password" name="senha"></td> 
			</tr>
			<tr>
			<td colspan="2"><input type="submit" value="Acessar"></td>
			</tr>
		</table>
	</form>
</body>
</html>
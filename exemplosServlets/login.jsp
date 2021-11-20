<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login de acesso</title>
<link href="css/login.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form action = "Login" method="post">
		<table>
			<tr>
				<td>Login: </td>
				<td><input type="text" name="login"/></td>
			</tr>
			<tr>
				<td>Senha: </td>
				<td><input type="password" name="senha"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Entrar"/></td>
			</tr>
		</table>
	</form>
</body>
</html>
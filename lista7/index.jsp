<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/index.css" rel="stylesheet" type="text/css">
<title>Exercicio 1 - Lista 7 </title>
</head>
<body>
	<form action = "cadastro" method="post">
		<table>
			<tr>
				<td>Nome: </td>
				<td><input type="text" name="nome"/></td>
			</tr>
			<tr>
				<td>Endereço: </td>
				<td><input type="text" name="endereco"/></td>
			</tr>
			<tr>
				<td>Bairro: </td>
				<td><input type="text" name="bairro"/></td>
			</tr>
			<tr>
				<td>Cidade: </td>
				<td><input type="text" name="cidade"/></td>
			</tr>
			<tr>
				<td>CEP: </td>
				<td><input type="text" name="cep"/></td>
			</tr>
			<tr>
				<td>Telefone: </td>
				<td><input type="text" name="telefone"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="CADASTRAR"/></td>
			</tr>
		</table>
	</form>
</body>
</html>
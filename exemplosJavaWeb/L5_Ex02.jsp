<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista 5 - Ex 02</title>
</head>
<body>
	<%
		for(int a=1; a<=100; a++){
	%>
	<table>
		<tr>
			<td> <%= a %> </td>
		</tr>
	</table>
	<%
		}
	%>
</body>
</html>
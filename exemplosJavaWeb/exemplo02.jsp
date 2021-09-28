<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabuada</title>
</head>
<body>
	<h1>Tabuada do 2</h1>
	
	<table>
	<%
		for(int a=1; a<=10; a++){
	%>
		<tr>
			<td> 2 </td>
			<td> * </td>
			<td> <%= a %> </td>
			<td> = </td>
			<td> <%= a * 2 %> </td>
		</tr>
		<%
		}
		%>
		
	</table>
</body>
</html>
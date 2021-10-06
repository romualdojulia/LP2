<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Avaliacao 5 - Exercicio 2</title>
</head>
<%!
	public ArrayList<Integer> abobora(){
		ArrayList<Integer> lista = new ArrayList<>();
		for(int i=0; i<=10000; i++){
			lista.add(i);
		}
		return lista;
}
%>
<body>
	<h3>Multiplos de 5 entre 1 e 10000</h3>
	<table>
		<tr>
		<%
			for(int i=1; i<=abobora().size(); i++){
				if(i%5 == 0){
		%>
			<td> <%= abobora().get(i) %> </td>
		</tr>
		<%
				}
		%>
		<%
			}
		%>
	</table>
</body>
</html>
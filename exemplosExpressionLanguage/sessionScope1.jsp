<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Expression Language EL:</h1>
	<%
	
		session.setAttribute("nome", "Bill Gates");
	
		session.setAttribute("email", "billgates@gmail.com");
	
	%>
	<a href="sessionScope2.jsp">Click</a>
</body>
</html>
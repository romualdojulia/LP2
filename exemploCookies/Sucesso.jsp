<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucesso</title>
</head>
<body>
	<%
	out.println("<h1>Cookies</h1>");
	
	for(Cookie c: request.getCookies() ){
		out.print("<div>" +c.getName() + "--->" + c.getValue() +  "</div>");
	}
	%>

</body>
</html>
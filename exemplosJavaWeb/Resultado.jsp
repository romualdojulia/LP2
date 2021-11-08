<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado</title>
</head>
<body>
	<%
		String login = request.getParameter("prontuario");
		String senha = request.getParameter("senha");
		
		if(login.equals("12345") && senha.equals("12345")){
			out.print("<h1> Parabens, voce conseguiu acessar o sistema!</h1>");
		}
		else
			response.sendRedirect(request.getContextPath() + "/Login.jsp");
	%>
</body>
</html>
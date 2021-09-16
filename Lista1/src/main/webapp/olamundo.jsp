<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	${lista.get(1)}

	<% 
		String = "Uma frase qualquer...";
		//sysout
	
	%>

	<% List<String> lista = (List<String>) request.getAttribute("informacaoRequisicao"); %>
	
	<ul>
		<% for(String info : lista) { %>
	
			<li><%= info %></li>
		
		<% } %>
		
	</ul>


</body>
</html>
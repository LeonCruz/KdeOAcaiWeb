<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean class="modelo.Clientes" id="cliente"/>
<jsp:useBean class="modelo.Lojas" id="loja"/>

<%@ page import= "java.sql.ResultSet" %>

<%
	cliente.setLogin(request.getParameter("usuario"));
	cliente.setSenha(request.getParameter("senha"));
	
	ResultSet busca = DAO.ClientesDAO.login(cliente);
	boolean logou= busca.next();
%>

<script>
	if(<%= logou%>) {
		alert("Login realizado com sucesso!");
		window.location = "index.jsp"
		<% session.setAttribute("ClienteID", busca.getInt("id")); %>
	} else {
		alert("Usuário ou senha incorretos!");
		window.location = "login.jsp"
	}
</script>

</body>
</html>
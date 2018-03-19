<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro - Usuário</title>
</head>
<body>

<jsp:useBean class="modelo.Clientes" id="cliente"/>

<%
	cliente.setLogin(request.getParameter("username"));
	cliente.setEmail(request.getParameter("email"));
	cliente.setNome(request.getParameter("nome"));
	cliente.setSenha(request.getParameter("pw"));
	
	boolean cadastrou = DAO.ClientesDAO.cadastrar(cliente);
	
	if(cadastrou) {
		response.sendRedirect("index.jsp");
	} else {
		response.sendRedirect("cadastro-user.jsp");
	}
%>

</body>
</html>
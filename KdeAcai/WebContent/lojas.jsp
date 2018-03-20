<%@page import="DAO.LojasDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="css/style.css" />
<title>Lojas</title>
</head>
<body>
	<header class="header-lojas"></header>
	<main class="principal">
	
	<jsp:useBean class="modelo.Lojas" id="loja"/>
	
	<%@ page import= "java.sql.ResultSet" %>
	
	<%
		int numTuplas = 0;
	
		ResultSet busca = DAO.LojasDAO.buscarLojas(request.getParameter("opcao"));
		busca.last();
		numTuplas = busca.getRow();
		busca.first();
		
	%>
	
		<div class="loja">
			<h2 class="titulo-loja"></h2>
			<span class="endereco-loja"></span>
			<div class="estrelas">*****</div>
			<div class="precos">
				<span class="preco"></span>
				<span class="preco"></span>
				<span class="preco"></span>
			</div>
		</div>
	</main>
</body>
</html>
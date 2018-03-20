<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro - Loja</title>
</head>
<body>

<jsp:useBean class="modelo.Lojas" id="loja"/>

<%
	loja.setNome(request.getParameter("nome"));
	loja.setEmail(request.getParameter("email"));
	loja.setSenha(request.getParameter("pw"));
	loja.setLocalizacao(request.getParameter("localizacao"));
	loja.setTelefone(request.getParameter("telefone"));
	loja.setTipoFino(request.getParameter("fino"));
	loja.setTipoMedio(request.getParameter("medio"));
	loja.setTipoGrosso(request.getParameter("grosso"));

	boolean cadastrou = DAO.LojasDAO.cadastrar(loja);
	
	if(cadastrou) {
		response.sendRedirect("index.jsp");
	} else {
		response.sendRedirect("cadastro-user.jsp");
	}
%>

</body>
</html>
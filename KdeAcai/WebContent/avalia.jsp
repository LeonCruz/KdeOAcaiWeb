<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>avalia loja/title>
</head>
<body>

<%

	int idCliente = Integer.parseInt(request.getParameter("idCliente")),
		idLoja = Integer.parseInt(request.getParameter("idLoja")),
		avaliacao = Integer.parseInt(request.getParameter("avaliacao"));
	System.out.printf("ID Cliente: %d", idCliente);

	DAO.ClientesDAO.avaliar(idCliente, idLoja, avaliacao);
%>

</body>
</html>
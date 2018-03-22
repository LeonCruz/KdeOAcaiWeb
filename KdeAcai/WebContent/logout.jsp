<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		session.setAttribute("ClienteID", "-1");
	
		if(session.getAttribute("ClienteID").toString().equals("-1")) {
			response.sendRedirect("index.jsp");
		} else {
			%>
			<script>
			alert("ERRO! Falha ao sair do sistema.\nPor favor, tente novamente.");
			window.location = "index.jsp";
			</script>
			<%
		}
	%>
	
</body>
</html>
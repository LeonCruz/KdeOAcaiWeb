<%@page import="DAO.LojasDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="css/style.css" />
<title>Lojas</title>

<script type="text/javascript">
	function avaliar(idLoja, idCliente, avaliacao) {
		var xhttp = new XMLHttpRequest();
		  xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		      document.getElementById("demo").innerHTML =
		      this.responseText;
		    }
		  };
		  xhttp.open("POST", "avalia.jsp", true);
		  xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		  xhttp.send("idLoja="+idLoja+"&idCliente="+idCliente+"&avaliacao="+avaliacao);
	}
</script>

</head>
<body>
	<header class="header-lojas"></header>
	<main class="principal">
	
	<jsp:useBean class="modelo.Lojas" id="loja"/>
	
	<%@ 
		page import= "java.sql.ResultSet, java.util.ArrayList"
	%>
	
	<%
		int numTuplas = 0, idCliente=0;
		ArrayList<Integer> idLojas = new ArrayList<Integer>();
	
		ResultSet busca = DAO.LojasDAO.buscarLojas(request.getParameter("opcao"));
		busca.last();
		numTuplas = busca.getRow();
		busca.first();
		
		try{
			idCliente = Integer.parseInt(session.getAttribute("ClienteID").toString());
		} catch(NullPointerException e) {
			System.out.println(e);
		}
		
		for(int i=0; i<numTuplas; i++) {
			idLojas.add(busca.getInt("id"));
	%>
	
		<div class="loja">
			<h2 class="titulo-loja"><%= busca.getString("nome") %></h2>
			<span class="endereco-loja"><%= busca.getString("localizacao") %></span>
			<form>
				 <label for="gostei">Gostei</label>
				<input type="radio" id="gostei" name="avalia" onclick="avaliar(${lojas.get(i)}, <%= idCliente %>, this.value)" value="1">
				<div class="estrelas"><%= busca.getFloat("avaliacao") %></div>
				<label for="ngostei">Não Gostei</label>
				<input type="radio" id="ngostei" name="avalia" onclick="avaliar(${lojas.get(i)}, <%= idCliente %>, this.value)" value="0">
			</form>
			
			<div class="precos">
				R$<span class="preco">
					<%= busca.getFloat("tipoFino") %>
				</span>
				R$<span class="preco">
					<%= busca.getFloat("tipoMedio") %>
				</span>
				R$<span class="preco">
					<%= busca.getFloat("tipoGrosso") %>
				</span>
			</div>
		</div>
		<hr>
		
		<%
			busca.next();
			} 
		%>
	</main>
</body>
</html>
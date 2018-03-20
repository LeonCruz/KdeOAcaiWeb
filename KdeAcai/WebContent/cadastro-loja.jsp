<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Cadastro - Loja</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style_cadLoja.css" />
</head>
<body>
	<div class="box">
	    <form action="cadastra-loja.jsp" method="post">
	        <label for="name">Nome Loja</label><br>
	        <input class="campText" type="text" name="nome" placeholder="Nome" required><br>
	        
	        <label for="email">E-mail</label><br>
	        <input class="campText" type="email" name="email" placeholder="nome@exemplo.com" required><br>
	
	        <label for="confemail">Confirma��o de E-mail</label><br>
	        <input class="campText" type="email" name="confemail" placeholder="nome@exemplo.com" required><br>
	
	        <label for="localizacao">Endere�o</label><br>
	        <input class="campText" type="text" name="localizacao" placeholder="Tv. WE 30, 400, Coqueiro" required><br>
	
	        <label for="telefone">Telefone</label><br>
	        <input class="campText" type="text" name="telefone" placeholder="9132556142" required><br>
	
	        <label for="pw">Senha</label><br>
	        <input class="campText" type="password" name="pw" placeholder="********" required><br>
	
	        <label for="confpw">Confirma��o da Senha</label><br>
	        <input class="campText" type="password" name="confpw" placeholder="********" required><br>
	
	        <h2>Pre�os</h2>
	
	        <label for="fino">A�a� Fino</label><br>
	        <input class="campText" type="text" name="fino" value=0 ><br>
	
	        <label for="medio">A�a� M�dio</label><br>
	        <input class="campText" type="text" name="medio" value=0 required><br>
	
	        <label for="grosso">A�a� Grosso</label><br>
	        <input class="campText" type="text" name="grosso" value=0 ><br>
	
	        <input class="btnCad" type="submit" value="Cadastrar">
	   	</form>
	 </div>
</body>
</html>
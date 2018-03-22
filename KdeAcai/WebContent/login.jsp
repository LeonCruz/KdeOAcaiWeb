<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" media="screen" href="css/style_login.css" />
		<title>Login</title>
	</head>
	<body>
		<div class="box">
			<h1>Kde o Açaí?</h1>
			<form action="logar.jsp" method="post">
				<input class="txt" name="usuario" type="text" placeholder="Usuário" required>
				<br>
				<input class="txt" name="senha" type="password" placeholder="Senha" required>
				<br>
				<input class="btn" type="submit" value="LOGIN">
				<a href="cadastro-user.jsp"><input class="btn" type="button" value="CADASTRAR-SE"></a>
				<br>
				<a href="">Esqueceu sua senha?</a>
			</form>
		</div>
		<img title="Login" alt="Login" src="http://www.agregacoworking.com.br/wp-content/uploads/2017/03/coworking-illustration.png">
	</body>
</html>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Cadastro - Loja</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style_cad.css" />
    <script src="js/main.js"></script>
</head>
<body>
    <form class="box" action="cadastra-loja.jsp" method="post">
        <label for="name">Nome Loja</label><br>
        <input class="campText" type="text" name="nome" placeholder="Nome" required><br>
        
        <label for="email">E-mail</label><br>
        <input class="campText" type="email" name="email" id="email" placeholder="nome@exemplo.com" required><br>

        <label for="confemail">Confirmação de E-mail</label><br>
        <input class="campText" type="email" name="confemail" placeholder="nome@exemplo.com" required onfocusout="isEquals('email', this)"><br>

        <label for="localizacao">Endereço</label><br>
        <input class="campText" type="text" name="localizacao" placeholder="Tv. WE 30, 400, Coqueiro" required><br>

        <label for="telefone">Telefone</label><br>
        <input class="campText" type="text" name="telefone" placeholder="9132556142" required><br>

        <label for="pw">Senha</label><br>
        <input class="campText" type="password" name="pw" id="pw" placeholder="********" required><br>

        <label for="confpw">Confirmação da Senha</label><br>
        <input class="campText" type="password" name="confpw" placeholder="********" required onfocusout="isEquals('pw', this)"><br>

        <label><h2>Preços</h2></label>

        <label for="fino">Açaí­ Fino</label><br>
        <input class="campText" type="text" name="fino" value="0"><br>

        <label for="medio">Açaí­ Médio</label><br>
        <input class="campText" type="text" name="medio" value="0" required><br>

        <label for="grosso">Açaí­ Grosso</label><br>
        <input class="campText" type="text" name="grosso" value="0"><br>

        <input type="submit" id="submit" value="Cadastrar">
        <a href="index.jsp">
        	<input type="button" value="Cancelar">
        </a>
   	</form>
   		<img title="Loja Açai" alt="Loja Açai" src="https://uploaddeimagens.com.br/images/001/341/213/full/aqui.png?1521741462">
</body>
</html>
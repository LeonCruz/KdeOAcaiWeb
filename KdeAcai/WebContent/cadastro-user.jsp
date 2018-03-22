<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Cadastro - Usuário</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style_cad.css" />
    <script src="js/main.js"></script>
</head>
<body>
    <form class="box" action="cadastra-user.jsp" method="post">
        <label for="name">Nome</label><br>
        <input class="campText" type="text" name="nome" placeholder="João da Silva" required><br>

        <label for="username">Nome de Usuário</label><br>
        <input class="campText" type="text" name="username" placeholder="josilva" required><br>
        
        <label for="email">E-mail</label><br>
        <input class="campText" type="email" name="email" id="email" placeholder="nome@exemplo.com" required><br>

        <label for="confemail">Confirmação de E-mail</label><br>
        <input class="campText" type="email" name="confirmemail" placeholder="nome@exemplo.com" required onfocusout="isEquals('email', this)"><br>

        <label for="pw">Senha</label><br>
        <input class="campText" type="password" name="pw" id="pw" placeholder="********" required><br>

        <label for="confpw">Confirmação da Senha</label><br>
        <input class="campText" type="password" name="confirmpw" placeholder="********" required onfocusout="isEquals('pw', this)"><br>

        <input type="submit" value="Cadastrar">
    </form>
    <img title="User" src="https://preview.ibb.co/dc6oAH/asd.png" alt="User">
</body>
</html>
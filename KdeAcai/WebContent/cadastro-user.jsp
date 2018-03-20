<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Cadastro - Usuário</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style.css" />
</head>
<body>
    <form action="cadastra-user.jsp" method="post">
        <label for="name">Nome</label><br>
        <input type="text" name="nome" placeholder="João da Silva" required><br>

        <label for="username">Nome de Usuário</label><br>
        <input type="text" name="username" placeholder="josilva" required><br>
        
        <label for="email">E-mail</label><br>
        <input type="email" name="email" placeholder="nome@exemplo.com" required><br>

        <label for="confemail">Confirmação de E-mail</label><br>
        <input type="email" name="confirmemail" placeholder="nome@exemplo.com" required><br>

        <label for="pw">Senha</label><br>
        <input type="password" name="pw" placeholder="********" required><br>

        <label for="confpw">Confirmação da Senha</label><br>
        <input type="password" name="confirmpw" placeholder="********" required><br>

        <input type="submit" value="Cadastrar">
    </form>
</body>
</html>
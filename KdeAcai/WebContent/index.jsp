<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Kde O Açaí?</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style.css" />
    <script src="main.js"></script>
</head>
<body>
    <main class="main-index">
	    <form action="lojas.jsp" method="get">
	        <img src="" alt="Logo">
	        
	        <input type="text" name="nome" placeholder="Ex.: Açaí do Beto" />
	        <input type="radio" name="opcao" id="classific" value="2" required>
	        <label for="classific">Classificação</label>
	        <input type="radio" name="opcao" id="preco" value="1" required>
	        <label for="preco">Preço</label>
	        
	        <input type="submit" value="Buscar!">
	    </form>
    </main>
    <footer class="footer-index">
        <a href="cadastro-loja.jsp"><button>Cadastrar Loja</button></a>
    </footer>
</body>
</html>
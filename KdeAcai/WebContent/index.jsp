<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Kde O Açaí?</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style_index.css" />
</head>
<body>
    <main class="main-index">
    <div class="box">
	    <form action="lojas.jsp" method="get">
	        <img src="img/logotemp.png" alt="Logo">
	        <br>
	        <input type="text" name="nome" placeholder="Ex.: Açaí do Beto" />
            <input type="submit" value="Buscar!">
            <br>
	        <input type="radio" name="opcao" id="classific" value="2" required>
	        <label for="classific">Classificação</label>
	        <input type="radio" name="opcao" id="preco" value="1" required>
	        <label for="preco">Preço</label>
	        
	        
	    </form>
    </div>
    </main>

    <footer class="footer-index">
        <a href="cadastro-loja.jsp"><button>Cadastrar Loja</button></a>
        <div class="copy">
        	<p>Copyright 2018 - Indie Atom</p>
        </div>
    </footer>
</body>
</html>
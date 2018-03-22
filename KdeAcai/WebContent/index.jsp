<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Kde O Açaí?</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style_index.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body style="margin: 0;">
    <main class="main-index">
    <div class="box">
	    <form action="lojas.jsp" method="get">
	        <img src="img/logotemp.png" alt="Logo">
	        <br>

	        <input type="text" name="nome" placeholder="Ex.: Açaí do Beto" />
            <span>
                <button id="btnBuscar" class="btnSeach" type="submit"><i class="fa fa-search"></i></button>
            </span>
            <br>

            <label class="container" id="classi" for="classific">Classificação
	        <input type="radio" name="opcao" id="classific" value="2" required>
            <span class="checkmark"></span>
            </label>
	        
            <label class="container" id="prec" for="preco">Preço
	        <input type="radio" name="opcao" id="preco" value="1" required>
            <span class="checkmark"></span>
            </label>
	        
	        
	    </form>
    </div>
    </main>

    <footer class="footer-index">
        <a href="cadastro-loja.jsp"><input class="btnCadastrar" type="button" value="CADASTRAR LOJA"></a>
        <div class="copy">
        	<p>Copyright 2018 - Indie Atom</p>
        </div>
    </footer>
</body>
</html>
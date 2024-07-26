<%@ page import="com.welldev.xadrezprojeto.model.Partida, com.welldev.xadrezprojeto.model.Peca" %>

<html>
<head>
    <title>Tabuleiro de Xadrez</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <style>
        #tabuleiro {
            --colunas: ${partida.tabuleiro.colunas};
            --linhas: ${partida.tabuleiro.linhas};
        }
    </style>
</head>
<body>
<div id="tabuleiro">
    <img src="${pageContext.request.contextPath}/tabuleiro" alt="Tabuleiro de Xadrez"/>
</div>
</body>
</html>

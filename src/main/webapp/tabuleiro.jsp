<%@ page import="com.welldev.xadrezprojeto.model.Partida, com.welldev.xadrezprojeto.model.Peca" %>
<%@page contentType="text/html" import="java.util.Date, java.text.*"
        pageEncoding="ISO-8859-1"%>

<html>
<head>
    <title>Tabuleiro de Xadrez</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div id="tabuleiro">
    <%= request.getAttribute("tabuleiro")%>
</div>
</body>
</html>

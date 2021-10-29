<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="./css/homePage.css" rel="stylesheet" />
<meta charset="ISO-8859-1">
<title>Loucadora System</title>
</head>
<body>
	<nav class="nav-bar">
		<h1>Loucadora System</h1>
	</nav>
	<c:import url="logout.jsp"/>
	<div class="container">
		<a class="botao" href="filmesAlugados">Filmes Alugados</a>
		<a class="botao" href="listaFilme">Alugar Filmes</a> <a
			class="botao" href="cadastroDeFilme">Cadastrar Filme
			Novo</a>
	</div>
	<footer class="rodape">
		<p>Autor: Deyson Trindade</p>
		<p>
			<a class="repo" href="https://github.com/Deyson-Trindade">Mais de
				meus trabalhos</a>
		</p>
		<p>Ligue para (11)4002-8922 para retirar suas dúvidas</p>
	</footer>
</body>
</html>
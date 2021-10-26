<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href=" https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="./css/listaDeFilme.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Lista Filmes</title>
</head>
<body>
<c:import url="logout.jsp"/>
	<c:choose>
		<c:when test="${not empty filmes}">
			<header>
				<h1>Filmes disponíveis para alugar:</h1>
			</header>
			<div>
				<c:forEach items="${filmes}" var="filme">
					<div class="cartao-filme">
						<ul>
							<li class="cartao-titulo"><c:out value="${filme.nome}" /></li>
							<li class="cartao-ano"><c:out value="${filme.ano}" /></li>
							<li class="cartao-sinopse"><c:out value="${filme.sinopse}" /></li>
						</ul>
						<a class="btn btn-primary"
							href="/loucadora/alugaFilme?id=${filme.id}">Alugar</a> <a
							class="btn btn-primary"
							href="/loucadora/alteraFilme?id=${filme.id}">Alterar</a>
					</div>
				</c:forEach>
			</div>
		</c:when>
		<c:when test="${empty filmes}">

			<h1>Não há filmes disponíveis para alugar no momento.</h1>

		</c:when>
	</c:choose>

</body>

</html>
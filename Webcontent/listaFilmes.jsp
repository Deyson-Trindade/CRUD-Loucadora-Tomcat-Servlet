<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href=" https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<meta charset="ISO-8859-1">
<title>Lista Filmes</title>
</head>
<body style="background-color:LightGray;">
	<div class="container">
		<p>Filmes disponíveis para alugar:</p>
					<ul>
						<c:forEach items="${filmes}" var="filme">
							<div style="background-color:LightGray;">
								<h5>
									<c:out value="${filme.nome}" />
								</h5>
								<h6>
									<c:out value="${filme.ano}" />
								</h6>
								<p>
									<c:out value="${filme.sinopse}" />
								</p>
								<a class="btn btn-primary"
									href="/loucadora/alugaFilme?id=${filme.id}">Alugar</a>
									<a class="btn btn-primary"
									href="/loucadora/alteraFilme?id=${filme.id}">Alterar</a>
							</div>
						</c:forEach>
					</ul>
				</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href=" https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="lista.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Lista Filmes</title>
</head>
<body>
<header>
	<h1>Filmes Alugados:</h1>
</header>

	<div >
					<ul>
						<c:forEach items="${filmes}" var="filme">
							<div class="cardFilm">
								<h5>
									<c:out value="${filme.nome}" />
								</h5>
								<h6>
									<c:out value="${filme.ano}" />
								</h6>
								<p>
									<c:out value="${filme.sinopse}" />
								</p>
							</div>
						</c:forEach>
					</ul>
				</div>
</body>
</html>
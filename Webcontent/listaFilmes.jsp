<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href=" https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
<meta charset="ISO-8859-1">
<title>Lista Filmes</title>
</head>
<body>
	<div>
		<ul class="list-group">
			<c:forEach items="${filmes}" var="filme">
				<li class="list-group-item">
					<ul	class="list-group list-group-horizontal">
						<li class="list-group-item"><c:out value="${filme.nome}"/></li>
						<li class="list-group-item"><c:out value="${filme.ano}"/></li>
						<li class="list-group-item"><c:out value="${filme.sinopse}"/></li>
						<li class="list-group-item"><c:out value="${filme.estaDisponivel}"/></li>
					</ul>
				</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>
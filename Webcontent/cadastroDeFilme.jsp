<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href=" https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="./css/form.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Cadastro de filme</title>
</head>
<body>
<c:import url="logout.jsp"/>

	<h1>Bem vindo ao cadastro de filmes, qual filme voc? deseja
		cadastrar no invent?rio?</h1>

	<form action="/loucadora/cadastroDeFilme" method="post">
		<div class="configuracaoDiv">
			<label>Nome:</label> <input type="text" name="nome"
				class="configInputNome" /> <br> <label class="configAno">Ano:</label>
			<input type="number" name="ano" class="configInputAno" /> <br>
			<label class="configSinopse">Sinopse:</label>
			<textarea name="sinopse" rows="5" cols="22"></textarea>
			<br> <label>Disponivel em estoque</label> <input type="checkbox"
				name="estaDisponivel" />

			<button type="submit">Enviar</button>
		</div>
	</form>


</body>
</html>
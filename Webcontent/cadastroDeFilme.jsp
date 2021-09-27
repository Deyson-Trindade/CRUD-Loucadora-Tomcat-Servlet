<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href=" https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="form.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Cadastro de filme</title>
</head>
<body>

	<h1>Bem vindo ao cadastro de filmes, qual filme você deseja
		cadastrar no inventário?</h1>

	<form action="/loucadora/cadastroDeFilme" method="post">
		<div>
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
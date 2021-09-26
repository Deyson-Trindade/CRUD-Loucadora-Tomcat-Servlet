<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href=" https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<meta charset="ISO-8859-1">
<title>Cadastro de filme</title>
</head>
<body>

	<form action="/loucadora/cadastroDeFilme" method="post">
		<div class="form-group">


			<label>Nome:</label> <input type="text" name="nome" /> <br> <label>Ano:</label>
			<input type="number" name="ano" /> <br> <label>Sinopse:</label>
			<textarea rows="10" cols="30" name="sinopse"></textarea>
			<label>Disponivel em estoque</label> <input type="checkbox"
				name="estaDisponivel" />

			<button type="submit">Enviar</button>
		</div>
	</form>


</body>
</html>
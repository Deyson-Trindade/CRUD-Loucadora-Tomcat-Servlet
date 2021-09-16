<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de filme</title>
</head>
<body>
		
		<form action="/loucadora/cadastroDeFilme" method="post">
		
			Nome do filme: <input type="text" name="nome"  />
			Ano: <input type="number" name="ano" />
			Sinopse: <textarea rows="10" cols="30" name="sinopse" ></textarea>
			Disponivel em estoque <input type="checkbox" name="estaDisponivel" />
			
			<button type="submit" >Enviar</button>
					
		</form>	
		
			
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="./css/form.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

	<form action="/loucadora/alteraFilme" method="post">

		<div class="configuracaoDiv">
			<label>Nome:</label>
			<input class="configInputNome" type="text" name="nome" value="${filme.nome}" /> <br>
			<label class="configAno">Ano:</label> 
			<input class="configInputAno" type="number" name="ano" value="${filme.ano}" /> <br>
			<label class="configSinopse">Sinopse:</label>
			<textarea rows="10" cols="30" name="sinopse" >${filme.sinopse}</textarea><br>
			<label>Disponivel em estoque</label> 
			<input type="checkbox" name="estaDisponivel" value="${filme.estaDisponivel}" />
			
			<button type="submit" >Enviar</button>	
		</div>	
		</form>	

</body>
</html>
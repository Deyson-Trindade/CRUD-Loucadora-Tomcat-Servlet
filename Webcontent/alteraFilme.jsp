<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/loucadora/alteraFilme" method="post">

		
			<label>Nome:</label>
			<input type="text" name="nome" value="${nome}" /> <br>
			<label>Ano:</label> 
			<input type="number" name="ano" value="${ano}" /> <br>
			<label>Sinopse:</label>
			<textarea rows="10" cols="30" name="sinopse" >${sinopse}</textarea>
			<label>Disponivel em estoque</label>
			<input type="checkbox" name="estaDisponivel" value="${estaDisponivel}" />
			
			<button type="submit" >Enviar</button>		
		</form>	

</body>
</html>
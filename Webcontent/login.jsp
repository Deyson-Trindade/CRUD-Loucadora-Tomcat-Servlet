<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/login.css"/>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div class="container">
		<form action="login" method="post">
			<label>Email</label>
			<input name="email" type="email"/>
			<label>Senha</label>
			<input name="senha" type="password"/>
			<button type="submit">Entrar</button>
		</form>
	</div>	
</body>
</html>
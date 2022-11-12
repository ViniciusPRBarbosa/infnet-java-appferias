<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de turistas</title>
</head>
	<body>
		<c:import url="/WEB-INF/jsp/menu.jsp"/>
		<div class="container">
	  <h2>Turista</h2>
	  <form action="/turista/incluir" method="post">
		<div class="form-group">
			<label>Nome:</label>
			<input type="text"	class="form-control" placeholder="Insira o nome" name="nome">
		</div>
		<div class="form-group">
			<label>E-mail:</label>
			<input type="email" class="form-control" placeholder="Insira o e-mail" name="email">
		</div>
		<div class="form-group">
			<label>Data de nascimento:</label>
			<input type="date" class="form-control" name="dataNascimento">
		</div>
		<div class="form-group">
			<label class="checkbox">Possui passaporte?<input type="checkbox" name="possuiPassaporte"></label>
		</div>
		<button type="submit" class="btn btn-default">Cadastrar</button>
	</form>
	</div>
	
</body>
</html>
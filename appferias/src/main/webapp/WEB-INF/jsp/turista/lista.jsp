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
	<div class="container mt-3">
		<h3>Turistas</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>E-mail</th>
 					<th>Data de Nascimento</th>
					<th>Possui passaporte?</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="turista" items="${listagem}">
					<tr>
						<td>${turista.id}</td>
						<td>${turista.nome}</td>
						<td>${turista.email}</td>
						<td>${turista.dataNascimento}</td>
						<td>${turista.possuiPassaporte}</td>
						<td><a href="/turista/${turista.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
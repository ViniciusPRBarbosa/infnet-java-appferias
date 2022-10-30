<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de turistas</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<h3>Turistas</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Nome</th>
					<th>E-mail</th>
					<th>Data de Nascimento</th>
					<th>Possui passaporte?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="turista" items="${listagem}">
					<tr>
						<td>${turista.nome}</td>
						<td>${turista.email}</td>
						<td>${turista.dataNascimento}</td>
						<td>${turista.possuiPassaporte}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
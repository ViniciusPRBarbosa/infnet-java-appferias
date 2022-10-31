<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Cadastramento de eventos</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
	  <h3>Eventos</h3>
	  <table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Descrição</th>
					<th>É pago?</th>
					<th>Custo do ingresso</th>
					<th>Endereço</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="evento" items="${listagem}">
					<tr>
						<td>${evento.id}</td>
						<td>${evento.descricao}</td>
						<td>${evento.ehPago}</td>
						<td>${evento.custoIngresso}</td>
						<td>${evento.endereco}</td>
						<td><a href="/evento/${evento.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>	  
	</div>
</body>
</html>
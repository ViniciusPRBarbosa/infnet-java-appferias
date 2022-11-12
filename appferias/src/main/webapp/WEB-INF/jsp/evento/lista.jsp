<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de eventos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
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
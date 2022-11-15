<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de passeios</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h3>Passeios</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Titulo</th>
					<th>Data de execução</th>
					<th>Em grupo?</th>
					<th>Local de origem</th>
					<th>Local de destino</th>
					<th>Possui pontos de parada?</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="passeio" items="${listagem}">
					<tr>
						<td>${passeio.id}</td>
						<td>${passeio.titulo}</td>
						<td>${passeio.dataExecucao}</td>
						<td>${passeio.emGrupo}</td>
						<td>${passeio.localOrigem}</td>
						<td>${passeio.localDestino}</td>
						<td>${passeio.possuiPontosDeParada}</td>
						<td><a href="/passeio/${passeio.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/passeio">
			<input type="button" class="btn btn-default" value="Novo" />
		</a>
	</div>
</body>
</html>
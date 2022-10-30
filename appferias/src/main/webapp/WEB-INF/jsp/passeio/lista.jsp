<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de passeios</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<h3>Passeios</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Titulo</th>
					<th>Data de execução</th>
					<th>Em grupo?</th>
					<th>Local de origem</th>
					<th>Local de destino</th>
					<th>Possui pontos de parada?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="passeio" items="${listagem}">
					<tr>
						<td>${passeio.titulo}</td>
						<td>${passeio.dataExecucao}</td>
						<td>${passeio.emGrupo}</td>
						<td>${passeio.localOrigem}</td>
						<td>${passeio.localDestino}</td>
						<td>${passeio.possuiPontosDeParada}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
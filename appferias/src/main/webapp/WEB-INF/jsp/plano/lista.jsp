<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de planos</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<h3>Planos</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Título</th>
					<th>Objetivo</th>
					<th>Data de execução</th>
					<th>Em grupo?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="plano" items="${listagem}">
					<tr>
						<td>${plano.id}</td>
						<td>${plano.titulo}</td>
						<td>${plano.objetivo}</td>
						<td>${plano.dataExecucao}</td>
						<td>${plano.emGrupo}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
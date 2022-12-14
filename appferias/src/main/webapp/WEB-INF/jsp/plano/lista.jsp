<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de planos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h3>Planos</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>T?tulo</th>
					<th>Objetivo</th>
					<th>Data de execu??o</th>
					<th>Em grupo?</th>
					<th></th>
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
						<td><a href="/plano/${plano.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
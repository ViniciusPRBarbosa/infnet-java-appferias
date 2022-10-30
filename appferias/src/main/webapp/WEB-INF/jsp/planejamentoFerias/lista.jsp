<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Cadastramento de planejamentos</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
	  <h3>Planejamentos de férias</h3>
	  <table class="table table-striped">
			<thead>
				<tr>
					<th>Título</th>
					<th>Data inicial</th>
					<th>Data final</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="planejamento" items="${listagem}">
					<tr>
						<td>${planejamento.titulo}</td>
						<td>${planejamento.dataInicio}</td>
						<td>${planejamento.dataFim}</td>
						<td>${planejamento.descricao}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>	  
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de planejamentos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
	  <h3>Planejamentos de férias</h3>
	  <table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Título</th>
					<th>Data inicial</th>
					<th>Data final</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="planejamento" items="${listagem}">
					<tr>
						<td>${planejamento.id}</td>
						<td>${planejamento.titulo}</td>
						<td>${planejamento.dataInicio}</td>
						<td>${planejamento.dataFim}</td>
						<td>${planejamento.descricao}</td>
						<td><a href="/planejamentoferias/${planejamento.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>	  
	</div>
</body>
</html>
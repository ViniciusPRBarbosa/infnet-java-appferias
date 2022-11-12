<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de visitas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
	  <h3>Visitas</h3>
	  <table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Endereco</th>
					<th>É ponto turistico?</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="visita" items="${listagem}">
					<tr>
						<td>${visita.id}</td>
						<td>${visita.endereco}</td>
						<td>${visita.ehPontoTuristico}</td>
						<td><a href="/visita/${visita.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>	  
	</div>
</body>
</html>
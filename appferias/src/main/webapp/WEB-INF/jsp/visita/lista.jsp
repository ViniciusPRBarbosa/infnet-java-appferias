<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Cadastramento de visitas</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
	  <h3>Visitas</h3>
	  <table class="table table-striped">
			<thead>
				<tr>
					<th>Endereco</th>
					<th>É ponto turistico?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="visita" items="${listagem}">
					<tr>
						<td>${visita.endereco}</td>
						<td>${visita.ehPontoTuristico}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>	  
	</div>
</body>
</html>
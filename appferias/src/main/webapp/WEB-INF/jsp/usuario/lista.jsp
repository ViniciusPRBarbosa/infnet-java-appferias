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
					<th>Nome</th>
					<th>E-mail</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="usuario" items="${listagem}">
					<tr>
						<td>${usuario.id}</td>
						<td>${usuario.nome}</td>
						<td>${usuario.email}</td>
						<td><a href="/usuario/${usuario.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>	  
	</div>
</body>
</html>
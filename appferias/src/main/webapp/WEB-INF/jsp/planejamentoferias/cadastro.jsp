<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Planejamento de Férias</title>
</head>
	<body>
		<c:import url="/WEB-INF/jsp/menu.jsp"/>
		<div class="container">
	  <h2>Planejamento de Férias</h2>
	  <form action="/planejamentoferias/incluir" method="post">
		<div class="form-group">
			<label>Título:</label>
			<input type="text"	class="form-control" placeholder="Insira o título" name="titulo">
		</div>
		<div class="form-group">
			<label>Descrição:</label>
			<input type="text" class="form-control" placeholder="Insira a descrição" name="descricao">
		</div>
		<div class="form-group">
			<label>Data inicial:</label>
			<input type="datetime-local" class="form-control" name="dataInicio">	
		</div>
		<div class="form-group">
			<label>Data final:</label>
			<input type="datetime-local" class="form-control" name="dataFim">	
		</div>
		<div class="form-group">
			<label>Turista:</label>
			<select name="turista" class="form-select">
				<c:forEach var="t" items="${turistas}">
					<option value="${t.id}">${t.nome}</option>
				</c:forEach>
			</select>						
		</div>
		<div class="form-group">
			<label>Planos:</label>
			<c:forEach var="p" items="${planos}">
				<div class="form-check">
					<input class="form-check-input" type="checkbox" name="planos" value="${p.id}"/>
					<label class="form-check-label"> ${p.titulo}</label>
				</div>
			</c:forEach>						
		</div>
		<button type="submit" class="btn btn-default">Cadastrar</button>
	</form>
	</div>
	
</body>
</html>
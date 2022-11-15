<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de eventos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container">
		<h2>Evento</h2>
		<form action="/evento/incluir" method="post">
			<div class="form-group">
				<label>T�tulo:</label> <input type="text" class="form-control"
					placeholder="Insira o t�tulo" name="titulo" />
			</div>
			<div class="form-group">
				<label>Objetivo:</label> <input type="text" class="form-control"
					placeholder="Insira o objetivo" name="objetivo" />
			</div>
			<div class="form-group">
				<label>Data de execu��o:</label> <input type="date"
					class="form-control" name="dataExecucao" />
			</div>
			<div class="form-group">
				<div class="checkbox">
					<label><input type="checkbox" name="emGrupo"> Em
						grupo?</label>
				</div>
			</div>
			<div class="form-group">
				<label>Descri��o:</label> <input type="text" class="form-control"
					placeholder="Insira a descri��o" name="descricao" />
			</div>
			<div class="form-group">
				<div class="checkbox">
					<label><input type="checkbox" name="ehPago"> �
						pago?</label>
				</div>
			</div>
			<div class="form-group">
				<label>Custo do ingresso:</label> <input type="number" class="form-control" name="custoIngresso" step=".01" />
			</div>
			<div class="form-group">
				<label>Endere�o:</label> <input type="text" class="form-control"
					placeholder="Insira o endere�o" name="endereco" />
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>		
	</div>
</body>
</html>
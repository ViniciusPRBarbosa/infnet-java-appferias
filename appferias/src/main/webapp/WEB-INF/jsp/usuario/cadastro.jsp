<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de usu?rios</title>
</head>
	<body>
		<c:import url="/WEB-INF/jsp/menu.jsp"/>
		<div class="container">
	  		<form action="/cep" method="post">
				<div class="form-group">
					<div class="row">
						<div class="col-sm-4">
							<input type="text" class="form-control"	placeholder="Insira o CEP a ser buscado" name="cep" />
						</div>
						<div class="col-sm-4">
							<button type="submit" class="btn btn-default" name="btnBuscaCep">Buscar</button>					
						</div>
					</div>			
				</div>			
			</form>
	  		<h2>Usu?rio</h2>
	  		<form action="/usuario/incluir" method="post">
				<div class="form-group">
					<label>Nome:</label>
					<input type="text"	class="form-control" placeholder="Insira o nome" name="nome">
				</div>
				<div class="form-group">
					<label>E-mail:</label>
					<input type="email" class="form-control" placeholder="Insira o e-mail" name="email">
				</div>
				<div class="form-group">
					<label>Senha:</label>
					<input type="password" class="form-control" placeholder="Insira a senha" name="senha">
				</div>
				
				<c:import url="/WEB-INF/jsp/endereco.jsp"/>
				
				<button type="submit" class="btn btn-default">Cadastrar</button>
			</form>
		</div>	
	</body>
</html>
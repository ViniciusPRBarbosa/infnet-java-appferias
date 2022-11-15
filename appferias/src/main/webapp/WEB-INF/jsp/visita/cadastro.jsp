<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de visitas</title>
	<script type="text/javascript">
		function incluirPontoDeInteresse()
  		{
			var hfPontosDeInteresse = document.getElementById('hfPontosDeInteresse'); 
			var txtPontoInteresse = document.getElementById('txtPontoInteresse');
			var valorPontoInteresse = txtPontoInteresse.value;
  			
     		if(valorPontoInteresse.trim() === ''){
     			alert('Favor incluir um valor para o ponto de interesse.');
     		}
     		else{
     			var listaPontosDeInteresse = document.getElementById('listaPontosDeInteresse');
     			var novoInteresse = document.createElement('li');
     			
     			novoInteresse.appendChild(document.createTextNode(valorPontoInteresse));
     			listaPontosDeInteresse.appendChild(novoInteresse);
     			
     			txtPontoInteresse.value = '';
     			
     			var arrayPontosDeInteresse = obterArrayPontosDeParadaAPartirDeLista(listaPontosDeInteresse);
     			
     			hfPontosDeInteresse.value = arrayPontosDeInteresse;
     		}
  		}
		
		function obterArrayPontosDeParadaAPartirDeLista(listaPontosParada){
			var retorno = [];
			var arrayAuxiliar = Array.from(listaPontosParada.children);
			
			arrayAuxiliar.forEach(parada => retorno.push(parada.innerText));
			
			return retorno;
		}
	</script>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container">
		<h2>Visita</h2>
		<form action="/visita/incluir" method="post">
			<div class="form-group">
				<label>Título:</label> <input type="text" class="form-control"
					placeholder="Insira o título" name="titulo" />
			</div>
			<div class="form-group">
				<label>Objetivo:</label> <input type="text" class="form-control"
					placeholder="Insira o objetivo" name="objetivo" />
			</div>
			<div class="form-group">
				<label>Data de execução:</label> <input type="date"
					class="form-control" name="dataExecucao" />
			</div>
			<div class="form-group">
				<div class="checkbox">
					<label><input type="checkbox" name="emGrupo"> Em
						grupo?</label>
				</div>
			</div>
			<div class="form-group">
				<label>Endereço:</label> <input type="text" class="form-control"
					placeholder="Insira o endereço" name="endereco" />
			</div>
			<div class="form-group">
				<div class="checkbox">
					<label><input type="checkbox" name="ehPontoTuristico"> É
						ponto turistico?</label>
				</div>
			</div>
			<div class="form-group">
				<label>Pontos de interesse:</label>
				<div class="row">
					<div class="col-sm-6">
						<input type="text" id="txtPontoInteresse" class="form-control"
							placeholder="Insira um ponto de interesse (opcional)" />
					</div>
					<div class="col-sm-2">
						<input type="button" id="btnInclusaoPontoInteresse"
							class="btn btn-default" onclick="incluirPontoDeInteresse()"
							value="Incluir" />
					</div>
				</div>
			</div>
			<input type="hidden" id="hfPontosDeInteresse" name="pontosDeInteresse" />
			<div class="form-group">
				<ol id="listaPontosDeInteresse">
				</ol>
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>		
	</div>
</body>
</html>
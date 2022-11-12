<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de usuários</title>
	<script type="text/javascript">
		function incluirPontoParada()
  		{
			var hfPontosDeParada = document.getElementById('hfPontosDeParada'); 
			var txtPontoParada = document.getElementById('txtPontoParada');
			var valorPontoParada = txtPontoParada.value;
  			
     		if(valorPontoParada.trim() === ''){
     			alert('Favor incluir um valor para o ponto de parada.');
     		}
     		else{
     			var listaPontosParada = document.getElementById('listaPontosParada');
     			var novaParada = document.createElement('li');
     			
     			novaParada.appendChild(document.createTextNode(valorPontoParada));
     			listaPontosParada.appendChild(novaParada);
     			
     			txtPontoParada.value = '';
     			
     			var arrayPontosDeParada = obterArrayPontosDeParadaAPartirDeLista(listaPontosParada);
     			
     			hfPontosDeParada.value = arrayPontosDeParada;
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
		<h2>Passeio</h2>
		<form action="/passeio/incluir" method="post">
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
				<label>Local de origem:</label> <input type="text"
					class="form-control" placeholder="Insira o local de origem"
					name="localOrigem" />
			</div>
			<div class="form-group">
				<label>Local de destino:</label> <input type="text"
					class="form-control" placeholder="Insira o local de destino"
					name="localDestino" />
			</div>
			<div class="form-group">
				<label>Pontos de parada:</label>
				<div class="row">
					<div class="col-sm-6">
						<input type="text" id="txtPontoParada" class="form-control"
							placeholder="Insira um ponto de parada (opcional)" />
					</div>
					<div class="col-sm-2">
						<input type="button" id="btnInclusaoPontoParada"
							class="btn btn-default" onclick="incluirPontoParada()"
							value="Incluir" />
					</div>
				</div>
			</div>
			<input type="hidden" id="hfPontosDeParada" name="pontosDeParada" />
			<div class="form-group">
				<ol id="listaPontosParada">
				</ol>
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>
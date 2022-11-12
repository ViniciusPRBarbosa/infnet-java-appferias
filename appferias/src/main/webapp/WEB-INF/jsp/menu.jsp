<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Planejamento de férias</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li class="nav-item"><a class="nav-link"
				href="/usuario/lista">Usuário</a>
			</li>
			<li class="nav-item"><a class="nav-link"
				href="/planejamentoferias/lista">Planejamento de férias</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/turista/lista">Turista</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/plano/lista">Plano</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/passeio/lista">Passeio</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/evento/lista">Evento</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/visita/lista">Visita</a>
			</li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="/usuario"><span class="glyphicon glyphicon-user"></span>
					Sign Up</a></li>
			<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
					Login</a></li>
		</ul>
	</div>
</nav>
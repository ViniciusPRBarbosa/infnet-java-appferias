package br.edu.infnet.appferias.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PlanejamentoFerias {
	
	private String titulo;
	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	private String descricao;
	private Turista turista;
	
	public PlanejamentoFerias() {
		titulo = "Novo planejamento de férias";
		dataInicio = LocalDateTime.now();
	}
	
	public PlanejamentoFerias(Turista turista) {
		this.turista = turista;
	}
	
	public Turista getTurista() {
		return turista;
	}

	public void setTurista(Turista turista) {
		this.turista = turista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		StringBuilder impressaoObjeto = new StringBuilder();
		
		impressaoObjeto.append("Informações do turista:");
		impressaoObjeto.append("\n");
		impressaoObjeto.append(turista);
		impressaoObjeto.append("\n");
		impressaoObjeto.append("Informações do planejamento:");
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Titulo: %s", titulo));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Descricao: %s", descricao));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Data inicial: %s", dataInicio.format(formatter)));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Data final: %s", dataFim.format(formatter)));
		impressaoObjeto.append("\n");
		
		return impressaoObjeto.toString();
	}
	
}

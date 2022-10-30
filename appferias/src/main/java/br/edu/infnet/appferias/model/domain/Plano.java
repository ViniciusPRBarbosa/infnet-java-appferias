package br.edu.infnet.appferias.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Plano {
	private String titulo;
	private String objetivo;
	private LocalDateTime dataExecucao;
	private Boolean emGrupo = null;
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public LocalDateTime getDataExecucao() {
		return dataExecucao;
	}

	public void setDataExecucao(LocalDateTime dataExecucao) {
		this.dataExecucao = dataExecucao;
	}

	public Boolean getEmGrupo() {
		return emGrupo;
	}

	public void setEmGrupo(Boolean emGrupo) {
		this.emGrupo = emGrupo;
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		StringBuilder impressaoObjeto = new StringBuilder();
		
		if(titulo != null)
		{
			impressaoObjeto.append(String.format("Titulo: %s", titulo));
			impressaoObjeto.append("\n");
		}
		
		if(objetivo != null)
		{
			impressaoObjeto.append(String.format("Objetivo: %s", objetivo));
			impressaoObjeto.append("\n");
		}
		
		if(dataExecucao != null)
		{
			impressaoObjeto.append(String.format("Data de execução: %s", dataExecucao.format(formatter)));
			impressaoObjeto.append("\n");
		}
		
		if(emGrupo != null)
			impressaoObjeto.append(String.format("Em grupo? %s", emGrupo ? "Sim": "Não"));
		
		return impressaoObjeto.toString();
	}
}

package br.edu.infnet.appferias.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Plano {
	public String titulo;
	public String objetivo;
	public LocalDateTime dataExecucao;
	public Boolean emGrupo = null;
	
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

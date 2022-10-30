package br.edu.infnet.appferias.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PlanejamentoFerias {
	
	public String titulo;
	public LocalDateTime dataInicio;
	public LocalDateTime dataFim;
	public String descricao;
	
	@Override
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		StringBuilder impressaoObjeto = new StringBuilder();
		
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

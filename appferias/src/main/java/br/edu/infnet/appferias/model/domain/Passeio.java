package br.edu.infnet.appferias.model.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tpasseio")
public class Passeio extends Plano {
	
	private String localOrigem;
	private String localDestino;
	private boolean possuiPontosDeParada;
	private ArrayList<String> pontosDeParada;
	
	public String getLocalOrigem() {
		return localOrigem;
	}

	public void setLocalOrigem(String localOrigem) {
		this.localOrigem = localOrigem;
	}

	public String getLocalDestino() {
		return localDestino;
	}

	public void setLocalDestino(String localDestino) {
		this.localDestino = localDestino;
	}

	public boolean isPossuiPontosDeParada() {
		return possuiPontosDeParada;
	}

	public void setPossuiPontosDeParada(boolean possuiPontosDeParada) {
		this.possuiPontosDeParada = possuiPontosDeParada;
	}

	public ArrayList<String> getPontosDeParada() {
		return pontosDeParada;
	}

	public void setPontosDeParada(ArrayList<String> pontosDeParada) {
		this.pontosDeParada = pontosDeParada;
	}

	@Override
	public String toString() {
		
		StringBuilder impressaoObjeto = new StringBuilder();
		
		impressaoObjeto.append(super.toString());
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Local de origem: %s", localOrigem));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Local de destino: %s", localDestino));
		
		if(possuiPontosDeParada && pontosDeParada != null)
		{
			impressaoObjeto.append("\n");
			impressaoObjeto.append("Pontos de parada:");
			impressaoObjeto.append("\n");
			
			pontosDeParada.forEach(
					(pontoDeParada) -> impressaoObjeto.append(
						String.format("%s - %s %s", pontosDeParada.indexOf(pontoDeParada) + 1, pontoDeParada, "\n")
					)
			);
		}
		
		return impressaoObjeto.toString();
	}
}

package br.edu.infnet.appferias.model.domain;

import java.util.ArrayList;

public class Passeio extends Plano {
	
	public String localOrigem;
	public String localDestino;
	public boolean possuiPontosDeParada;
	public ArrayList<String> pontosDeParada;
	
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

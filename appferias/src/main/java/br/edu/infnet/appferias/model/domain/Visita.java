package br.edu.infnet.appferias.model.domain;

import java.util.ArrayList;

public class Visita extends Plano {
	public String endereco;
	public boolean ehPontoTuristico;
	public ArrayList<String> pontosDeInteresse;

	@Override
	public String toString() {
		StringBuilder impressaoObjeto = new StringBuilder();

		impressaoObjeto.append(super.toString());
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Endereço: %s", endereco));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("É ponto turístico: %s", ehPontoTuristico ? "Sim" : "Não"));
		
		if(pontosDeInteresse != null)
		{
			impressaoObjeto.append("\n");
			impressaoObjeto.append("Pontos de interesse:");
			impressaoObjeto.append("\n");
			
			pontosDeInteresse.forEach(
					(pontoDeInteresse) -> impressaoObjeto.append(
						String.format("%s - %s %s", pontosDeInteresse.indexOf(pontoDeInteresse) + 1, pontoDeInteresse, "\n")
					)
			);
		}
		else
			impressaoObjeto.append("\n");

		return impressaoObjeto.toString();
	}
}

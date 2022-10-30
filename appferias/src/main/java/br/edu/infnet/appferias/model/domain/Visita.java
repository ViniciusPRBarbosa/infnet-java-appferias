package br.edu.infnet.appferias.model.domain;

import java.util.ArrayList;

public class Visita extends Plano {
	private String endereco;
	private boolean ehPontoTuristico;
	private ArrayList<String> pontosDeInteresse;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public boolean isEhPontoTuristico() {
		return ehPontoTuristico;
	}

	public void setEhPontoTuristico(boolean ehPontoTuristico) {
		this.ehPontoTuristico = ehPontoTuristico;
	}

	public ArrayList<String> getPontosDeInteresse() {
		return pontosDeInteresse;
	}

	public void setPontosDeInteresse(ArrayList<String> pontosDeInteresse) {
		this.pontosDeInteresse = pontosDeInteresse;
	}

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

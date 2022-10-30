package br.edu.infnet.appferias.model.domain;

public class Evento extends Plano {
	
	public String descricao;
	public boolean ehPago;
	public float custoIngresso;
	public String endereco;
	
	@Override
	public String toString() {
		StringBuilder impressaoObjeto = new StringBuilder();
		
		impressaoObjeto.append(super.toString());
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Descrição: %s", descricao));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Endereço: %s", endereco));
		
		if(ehPago)
		{
			impressaoObjeto.append("\n");
			impressaoObjeto.append(String.format("Custo do ingresso: %f", custoIngresso));			
		}
		
		impressaoObjeto.append("\n");
		
		return impressaoObjeto.toString();
	}
}

package br.edu.infnet.appferias.model.domain;

public class Evento extends Plano {
	
	private String descricao;
	private boolean ehPago;
	private float custoIngresso;
	private String endereco;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isEhPago() {
		return ehPago;
	}

	public void setEhPago(boolean ehPago) {
		this.ehPago = ehPago;
	}

	public float getCustoIngresso() {
		return custoIngresso;
	}

	public void setCustoIngresso(float custoIngresso) {
		this.custoIngresso = custoIngresso;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

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

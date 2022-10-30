package br.edu.infnet.appferias.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Turista {
	public String nome;
	public String email;
	public LocalDateTime dataNascimento;
	public boolean possuiPassaporte;
	
	@Override
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		StringBuilder impressaoObjeto = new StringBuilder();
		
		impressaoObjeto.append(String.format("Nome: %s", nome));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("E-mail: %s", email));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Data de nascimento: %s", dataNascimento.format(formatter)));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Possui passaporte? %s", possuiPassaporte ? "Sim": "Não"));
		impressaoObjeto.append("\n");
		
		return impressaoObjeto.toString();
	}
}

package br.edu.infnet.appferias.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Turista {
	private Integer id;
	private String nome;
	private String email;
	private LocalDateTime dataNascimento;
	private boolean possuiPassaporte;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean isPossuiPassaporte() {
		return possuiPassaporte;
	}

	public void setPossuiPassaporte(boolean possuiPassaporte) {
		this.possuiPassaporte = possuiPassaporte;
	}

	@Override
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		StringBuilder impressaoObjeto = new StringBuilder();
		
		impressaoObjeto.append(String.format("Id: %s", id));
		impressaoObjeto.append("\n");
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

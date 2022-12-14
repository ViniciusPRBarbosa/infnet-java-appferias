package br.edu.infnet.apiturista.model.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tturista")
public class Turista {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private LocalDate dataNascimento;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

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

	public boolean isPossuiPassaporte() {
		return possuiPassaporte;
	}

	public void setPossuiPassaporte(boolean possuiPassaporte) {
		this.possuiPassaporte = possuiPassaporte;
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		StringBuilder impressaoObjeto = new StringBuilder();
		
		impressaoObjeto.append(String.format("Id: %s", id));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Nome: %s", nome));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("E-mail: %s", email));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Data de nascimento: %s", dataNascimento.format(formatter)));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Possui passaporte? %s", possuiPassaporte ? "Sim": "N??o"));
		impressaoObjeto.append("\n");
		
		return impressaoObjeto.toString();
	}
}

package br.edu.infnet.apiplanejamentoferias.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "tusuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	
	@OneToMany
	@JoinColumn(name = "idUsuario")
	@JsonManagedReference(value="turista-usuario")
	private List<Turista> turistas;
	
	@OneToMany
	@JoinColumn(name = "idUsuario")
	@JsonManagedReference(value="usuario-planejamento")
	private List<PlanejamentoFerias> planejamentoFerias;
	
	@OneToMany
	@JoinColumn(name = "idUsuario")
	@JsonManagedReference(value="usuario-plano")
	private List<Plano> plano;
	
	public List<PlanejamentoFerias> getPlanejamentoFerias() {
		return planejamentoFerias;
	}

	public void setPlanejamentoFerias(List<PlanejamentoFerias> planejamentoFerias) {
		this.planejamentoFerias = planejamentoFerias;
	}

	public List<Plano> getPlano() {
		return plano;
	}

	public void setPlano(List<Plano> plano) {
		this.plano = plano;
	}

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idEndereco")
	private Endereco endereco;
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Turista> getTuristas() {
		return turistas;
	}

	public void setTuristas(List<Turista> turistas) {
		this.turistas = turistas;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

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

	@Override
	public String toString() {
		
		StringBuilder impressaoObjeto = new StringBuilder();
		
		impressaoObjeto.append(String.format("Id: %s", id));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Nome: %s", nome));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("E-mail: %s", email));
		impressaoObjeto.append("\n");
			
		return impressaoObjeto.toString();
	}
}

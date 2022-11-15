package br.edu.infnet.apiplanejamentoferias.model.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tplano")
@Inheritance(strategy = InheritanceType.JOINED)
public class Plano {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String objetivo;
	private LocalDate dataExecucao;
	private Boolean emGrupo = false;
	
	@ManyToMany(mappedBy = "planos")
	@JsonIgnoreProperties(value="planos")
	private List<PlanejamentoFerias> planejamentosFerias;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	@JsonBackReference(value="usuario-plano")
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public Boolean getEmGrupo() {
		return emGrupo;
	}

	public void setEmGrupo(Boolean emGrupo) {
		this.emGrupo = emGrupo;
	}
	
	public LocalDate getDataExecucao() {
		return dataExecucao;
	}

	public void setDataExecucao(LocalDate dataExecucao) {
		this.dataExecucao = dataExecucao;
	}

	@Override
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		StringBuilder impressaoObjeto = new StringBuilder();
		
		if(id != null)
		{
			impressaoObjeto.append(String.format("Id: %s", id));
			impressaoObjeto.append("\n");
		}
		
		if(titulo != null)
		{
			impressaoObjeto.append(String.format("Titulo: %s", titulo));
			impressaoObjeto.append("\n");
		}
		
		if(objetivo != null)
		{
			impressaoObjeto.append(String.format("Objetivo: %s", objetivo));
			impressaoObjeto.append("\n");
		}
		
		if(dataExecucao != null)
		{
			impressaoObjeto.append(String.format("Data de execução: %s", dataExecucao.format(formatter)));
			impressaoObjeto.append("\n");
		}
		
		if(emGrupo != null)
			impressaoObjeto.append(String.format("Em grupo? %s", emGrupo ? "Sim": "Não"));
		
		return impressaoObjeto.toString();
	}

	public List<PlanejamentoFerias> getPlanejamentosFerias() {
		return planejamentosFerias;
	}

	public void setPlanejamentosFerias(List<PlanejamentoFerias> planejamentosFerias) {
		this.planejamentosFerias = planejamentosFerias;
	}
}

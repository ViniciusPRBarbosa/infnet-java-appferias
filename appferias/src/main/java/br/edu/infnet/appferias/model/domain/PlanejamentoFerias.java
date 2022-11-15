package br.edu.infnet.appferias.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tplanejamentoFerias")
public class PlanejamentoFerias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String titulo;
	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	private String descricao;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idTurista")
	private Turista turista;
	
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Plano> planos;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
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

	public List<Plano> getPlanos() {
		return planos;
	}

	public void setPlanos(List<Plano> planos) {
		this.planos = planos;
	}

	public PlanejamentoFerias() {
		titulo = "Novo planejamento de férias";
		dataInicio = LocalDateTime.now();
	}
	
	public PlanejamentoFerias(Turista turista) {
		this.turista = turista;
	}
	
	public Turista getTurista() {
		return turista;
	}

	public void setTurista(Turista turista) {
		this.turista = turista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		StringBuilder impressaoObjeto = new StringBuilder();
		
		impressaoObjeto.append(String.format("Id do planejamento: %s", id));
		impressaoObjeto.append("\n");
		impressaoObjeto.append("Informações do turista:");
		impressaoObjeto.append("\n");
		impressaoObjeto.append(turista);
		impressaoObjeto.append("\n");
		impressaoObjeto.append("Informações do planejamento:");
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Titulo: %s", titulo));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Descricao: %s", descricao));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Data inicial: %s", dataInicio.format(formatter)));
		impressaoObjeto.append("\n");
		impressaoObjeto.append(String.format("Data final: %s", dataFim.format(formatter)));
		impressaoObjeto.append("\n");
		
		if((planos != null) && (planos.size() > 0))
		{
			impressaoObjeto.append("\n");
			impressaoObjeto.append(String.format("Planos (%s no total):", planos.size()));
			
			for (Plano plano : planos) {
				impressaoObjeto.append("\n");
				impressaoObjeto.append(plano);
			}
		}
		else {
			impressaoObjeto.append("\n");
			impressaoObjeto.append("Não há nenhum plano cadastrado.");
		}	
		
		return impressaoObjeto.toString();
	}
	
}

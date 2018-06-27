package br.com.correios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cidades")
public class Cidade {

	@Id
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_estado")
	private Estado estado;
	private String nome;
	private String situacao;
	@Column(name="tipo_faixa")
	private String tipoFaixa;
	@Column(name="faixa_cep_localidade")
	private String faixaCepLocalidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getTipoFaixa() {
		return tipoFaixa;
	}

	public void setTipoFaixa(String tipoFaixa) {
		this.tipoFaixa = tipoFaixa;
	}

	public String getFaixaCepLocalidade() {
		return faixaCepLocalidade;
	}

	public void setFaixaCepLocalidade(String faixaCepLocalidade) {
		this.faixaCepLocalidade = faixaCepLocalidade;
	}

}

package br.com.correios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estados")
public class Estado {

	@Id
	private Long id;
	private String uf;
	private String nome;
	@Column(name = "faixa_cep")
	private String faixaCep;

	public String getFaixaCep() {
		return faixaCep;
	}

	public void setFaixaCep(String faixaCep) {
		this.faixaCep = faixaCep;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

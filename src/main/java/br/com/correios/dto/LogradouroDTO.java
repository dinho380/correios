package br.com.correios.dto;

public class LogradouroDTO {
	
	private String nomeLogradouro;
	private String bairroDistrito;
	private String localidadeUf;
	private String cep;
	
	// Ctrl +3 = pesquisa "gcuf" Generation Contrutor --------- crindo contrutor para passar o objeto de logradouros direto para
	public LogradouroDTO(String nomeLogradouro, String bairroDistrito, String localidadeUf, String cep) {
		this.nomeLogradouro = nomeLogradouro;
		this.bairroDistrito = bairroDistrito;
		this.localidadeUf = localidadeUf;
		this.cep = cep;
	}
	public String getNomeLogradouro() {
		return nomeLogradouro;
	}
	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}
	public String getBairroDistrito() {
		return bairroDistrito;
	}
	public void setBairroDistrito(String bairroDistrito) {
		this.bairroDistrito = bairroDistrito;
	}
	public String getLocalidadeUf() {
		return localidadeUf;
	}
	public void setLocalidadeUf(String localidadeUf) {
		this.localidadeUf = localidadeUf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}


}

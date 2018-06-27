package br.com.correios.dto;

public class FaixaCepDTO {
			
	private String uf;
	private String cep;
	public FaixaCepDTO(String uf, String cep) {
		this.uf = uf;
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	

	
}
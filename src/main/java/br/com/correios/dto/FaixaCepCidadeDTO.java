package br.com.correios.dto;

public class FaixaCepCidadeDTO {
			
	private String localidade;
	private String localidadeFaixaCep;
	private String situacao;
	private String tipodeFaixa;

	public FaixaCepCidadeDTO(String localidade, String localidadeFaixaCep, String situacao, String tipodeFaixa) {
		this.localidade = localidade;
		this.localidadeFaixaCep = localidadeFaixaCep;
		this.situacao = situacao;
		this.tipodeFaixa = tipodeFaixa;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getLocalidadeFaixaCep() {
		return localidadeFaixaCep;
	}
	public void setLocalidadeFaixaCep(String localidadeFaixaCep) {
		this.localidadeFaixaCep = localidadeFaixaCep;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getTipodeFaixa() {
		return tipodeFaixa;
	}
	public void setTipodeFaixa(String tipodeFaixa) {
		this.tipodeFaixa = tipodeFaixa;
	}
	
}
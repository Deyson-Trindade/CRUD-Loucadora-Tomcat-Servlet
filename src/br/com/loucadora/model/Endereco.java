package br.com.loucadora.model;

public class Endereco {
	private String bairro;
	private String rua;
	private Integer numero;
	private Integer cep;
	
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}

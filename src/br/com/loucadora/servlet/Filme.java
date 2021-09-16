package br.com.loucadora.servlet;

public class Filme {
	
	private	String nome;
	private	String sinopse;
	private	Integer ano;
	private	boolean estaDisponivel;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public boolean isEstaDisponivel() {
		return estaDisponivel;
	}
	public void setEstaDisponivel(boolean estaDisponivel) {
		this.estaDisponivel = estaDisponivel;
	}
	
	
	
}

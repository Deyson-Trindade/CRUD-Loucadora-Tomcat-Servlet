package br.com.loucadora.model;

public class Filme {
	
	private	String nome;
	private	String sinopse;
	private	Integer ano;
	private Integer id;
	private	boolean estaDisponivel;
	
	public Filme() {
		
	}
	
	public Filme(String nome, String sinopse, Integer ano, boolean estaDisponivel) {
		this.nome = nome;
		this.sinopse = sinopse;
		this.ano = ano;
		this.estaDisponivel = estaDisponivel;
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
	public boolean getEstaDisponivel() {
		return estaDisponivel;
	}
	public void setEstaDisponivel(boolean estaDisponivel) {
		this.estaDisponivel = estaDisponivel;
	}
	
	
	
}

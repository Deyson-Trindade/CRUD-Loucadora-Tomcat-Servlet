package br.com.loucadora.model;

public class Cliente {
	
	private String nome;
	private Integer cpf;
	private String dataNascimento;

	
	public Cliente(String nome, Integer cpf, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}


}

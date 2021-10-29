package br.com.loucadora.model;

public class Funcionario {
	
	private String email;
	private String senha;
	
	public Funcionario(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}
	
}

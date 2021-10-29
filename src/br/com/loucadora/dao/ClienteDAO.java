package br.com.loucadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.loucadora.banco.ConnectionFactory;
import br.com.loucadora.model.Cliente;



public class ClienteDAO {
	
	private ConnectionFactory conFactory = null;
	
	public ClienteDAO() {
		this.conFactory = new ConnectionFactory();
	}
	
	public boolean insere(Cliente cliente) {
		
		final String sql = "INSERT INTO cliente (nome, cpf, dataNascimento ) VALUES(?,?,?)";
		
		try(Connection con = this.conFactory.getConnection(); PreparedStatement stmt = con.prepareStatement(sql);) {
			
			final String nome = cliente.getNome();
			final Integer cpf = cliente.getCpf();
			final String dataNascimento = cliente.getDataNascimento();
			
			stmt.setString(1, nome);
			stmt.setInt(2, cpf);
			stmt.setString(3, dataNascimento);
			
			stmt.execute();
			
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
}

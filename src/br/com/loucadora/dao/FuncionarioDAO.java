package br.com.loucadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.loucadora.banco.ConnectionFactory;

public class FuncionarioDAO {
	
	private ConnectionFactory confactory = null;
	
	public FuncionarioDAO() {
		this.confactory = new ConnectionFactory();
	}
	
	public boolean existe(final String email, final String senha){
		
		final String sql = "select * from funcionario where email=? and senha=?";
		
		try(Connection con = this.confactory.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql)) {
			
			stmt.setString(1, email);
			stmt.setString(2, senha);
			
			try(ResultSet rs = stmt.executeQuery()){
				
				return rs.next();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	
}

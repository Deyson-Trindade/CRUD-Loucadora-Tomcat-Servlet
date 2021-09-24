package br.com.loucadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.loucadora.banco.ConnectionFactory;
import br.com.loucadora.model.Filme;

public class FilmeDAO {
	
	private ConnectionFactory conFactory = null;
	
	public FilmeDAO(){
		this.conFactory = new ConnectionFactory();
	}

	public List<Filme> listar() {
		final String sql = "select * from filme where estaDisponivel = 1";
		
		final List<Filme> filmes = new ArrayList<>();
		
		try(Connection con = this.conFactory.getConnection(); PreparedStatement stmt = con.prepareStatement(sql); ResultSet rs = stmt.executeQuery()){
			

			  while (rs.next()) {

				  Filme filme = new Filme();
			      filme.setNome(rs.getString("nome"));
			      filme.setSinopse(rs.getString("sinopse"));
			      filme.setAno(rs.getInt("ano"));
			      filme.setEstaDisponivel(rs.getBoolean("estaDisponivel"));
			      filme.setId(rs.getInt("id"));


			      filmes.add(filme);
			  }
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return filmes;
	}
}

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

	public FilmeDAO() {
		this.conFactory = new ConnectionFactory();
	}

	public List<Filme> listarDisponiveis() {
		final String sql = "select * from filme where estaDisponivel = 1";

		final List<Filme> filmes = new ArrayList<>();

		try (Connection con = this.conFactory.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery()) {

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

	public boolean insere(Filme filme) {
		final String sql = "insert into filme (nome, ano, sinopse, estaDisponivel) values (?,?,?,?)";

		try (Connection con = this.conFactory.getConnection(); PreparedStatement stmt = con.prepareStatement(sql);) {

			final String nome = filme.getNome();
			final int ano = filme.getAno();
			final String sinopse = filme.getSinopse();
			final boolean estaDisponivel = filme.getEstaDisponivel();

			stmt.setString(1, nome);
			stmt.setInt(2, ano);
			stmt.setString(3, sinopse);
			stmt.setBoolean(4, estaDisponivel);

			stmt.executeUpdate();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public Filme recupera(Integer id) {

		final Filme filme = new Filme();

		String sql = "SELECT * FROM filme WHERE id = ?";

		try (Connection con = this.conFactory.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)) {
			
			
			stmt.setInt(1, id);
			try(ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					filme.setNome(rs.getString("nome"));
					filme.setSinopse(rs.getString("sinopse"));
					filme.setAno(rs.getInt("ano"));
					filme.setEstaDisponivel(rs.getBoolean("estaDisponivel"));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return filme;
	}

	public boolean altera(Filme filme) {

		final String sql = "UPDATE filme set nome = ?, ano=?, sinopse=?, estaDisponivel=? WHERE id = ?";

		try (Connection con = this.conFactory.getConnection(); PreparedStatement stmt = con.prepareStatement(sql);) {

			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean aluga(int id) {

		final String sql = "UPDATE filme SET estaDisponivel = 0 WHERE id = ?";

		try (Connection con = this.conFactory.getConnection(); PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setInt(1, id);
			stmt.executeUpdate();

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public List<Filme> listarAlugados() {
		final String sql = "select * from filme where estaDisponivel = 0";

		final List<Filme> filmes = new ArrayList<>();

		try (Connection con = this.conFactory.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery()) {

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

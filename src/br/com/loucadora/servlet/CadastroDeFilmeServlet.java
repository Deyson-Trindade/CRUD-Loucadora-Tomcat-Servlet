package br.com.loucadora.servlet;

import br.com.loucadora.banco.ConnectionFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastroDeFilme")
public class CadastroDeFilmeServlet extends HttpServlet {

	private static final long serialVersionUID = 4129675844491493651L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("/cadastroDeFilme.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String sql = "insert into filme (nome, ano, sinopse, estaDisponivel) values (?,?,?,?)";

		ConnectionFactory conFactory = new ConnectionFactory();
		Connection con = conFactory.getConnection();

		try {

			final String nome = request.getParameter("nome");
			final int ano = Integer.parseInt(request.getParameter("ano"));
			final String sinopse = (String) request.getParameter("sinopse");
			final boolean estaDisponivel = "on".equalsIgnoreCase(request.getParameter("estaDisponivel"));

			PreparedStatement statement = con.prepareStatement(sql);

			statement.setString(1, nome);
			statement.setInt(2, ano);
			statement.setString(3, sinopse);
			statement.setBoolean(4, estaDisponivel);

			statement.executeUpdate();

			statement.close();

			response.sendRedirect("filmeCadastrado");

		} catch (Exception e) {
			throw new IOException();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

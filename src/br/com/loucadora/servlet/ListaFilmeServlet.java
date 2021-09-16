package br.com.loucadora.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.loucadora.banco.ConnectionFactory;


@WebServlet("/listaFilme")
public class ListaFilmeServlet extends HttpServlet {
	
	private static final long serialVersionUID = -8785137614145017374L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sql = "select * from filme";
		
		ConnectionFactory conFactory = new ConnectionFactory();
		Connection con = conFactory.getConnection();
		
		try {
			
			List<Filme> filmes = new ArrayList<>();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			  ResultSet rs = stmt.executeQuery();


			  while (rs.next()) {

				  Filme filme = new Filme();
			      filme.setNome(rs.getString("nome"));
			      filme.setSinopse(rs.getString("sinopse"));
			      filme.setAno(rs.getInt("ano"));
			      filme.setEstaDisponivel(rs.getBoolean("estaDisponivel"));


			      filmes.add(filme);
			  }
			  
			  request.setAttribute("filmes", filmes);

			  
			  RequestDispatcher rd = request.getRequestDispatcher("/listaFilmes.jsp");
			  rd.forward(request, response);
			  
			  rs.close();
			  stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		
		
		
		
	}



}

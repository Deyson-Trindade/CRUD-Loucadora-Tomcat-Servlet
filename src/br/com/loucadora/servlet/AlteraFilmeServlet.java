package br.com.loucadora.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.loucadora.banco.ConnectionFactory;


@WebServlet("/alteraFilme")
public class AlteraFilmeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Integer id = Integer.valueOf(request.getParameter("id"));
		String sql = "SELECT * FROM filme WHERE id = ?";
		
		ConnectionFactory conFactory = new ConnectionFactory();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			
			con = conFactory.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			
			rs = stmt.executeQuery();
			
			if( rs.next()) {
				request.setAttribute("nome", rs.getString("nome"));
				request.setAttribute("ano", rs.getInt("ano"));
				request.setAttribute("sinopse", rs.getString("sinopse"));
				request.setAttribute("estaDisponivel", rs.getBoolean("estaDisponivel"));
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}

				if(stmt != null) {
					stmt.close();
				}
				
				if( con != null) {
					con.close();
				}	
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		

		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/alteraFilme.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String sinopse = request.getParameter("sinopse");
		Integer estaDisponivel = Integer.valueOf(request.getParameter("estaDisponivel"));
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		String sql = "UPDATE filme set nome = ?, ano=?, sinopse=?, estaDisponivel=? WHERE id = ?";

		ConnectionFactory conFactory = new ConnectionFactory();
		Connection con = conFactory.getConnection();
		PreparedStatement stmt = null;
		

		try {

		stmt = con.prepareStatement(sql);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

	}
}

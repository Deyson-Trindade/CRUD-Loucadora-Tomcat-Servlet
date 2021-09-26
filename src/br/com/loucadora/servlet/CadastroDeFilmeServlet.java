package br.com.loucadora.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.loucadora.dao.FilmeDAO;
import br.com.loucadora.model.Filme;

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

		try {
			
			final String nome = request.getParameter("nome");
			final String sinopse = (String) request.getParameter("sinopse");
			final int ano = Integer.parseInt(request.getParameter("ano"));
			final boolean estaDisponivel = "on".equalsIgnoreCase(request.getParameter("estaDisponivel"));
			
			final Filme filme = new Filme(nome, sinopse, ano, estaDisponivel);
			final FilmeDAO filmeDao = new FilmeDAO();
			
			filmeDao.insere(filme);
			
			response.sendRedirect("filmeCadastrado");

		} catch (Exception e) {
			throw new IOException();
		} 
			
		
	}

}

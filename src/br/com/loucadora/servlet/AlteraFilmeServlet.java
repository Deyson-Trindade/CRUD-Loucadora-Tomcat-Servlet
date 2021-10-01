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

@WebServlet("/alteraFilme")
public class AlteraFilmeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		FilmeDAO filmeDao = new FilmeDAO();
		Integer id = Integer.valueOf(request.getParameter("id"));
		Filme filme = filmeDao.recupera(id);
		
		
		request.setAttribute("filme", filme);

		RequestDispatcher rd = request.getRequestDispatcher("/alteraFilme.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		final String nome = request.getParameter("nome");
		final String sinopse = request.getParameter("sinopse");
		final boolean estaDisponivel = "on".equalsIgnoreCase(request.getParameter("estaDisponivel"));
		final Integer ano = Integer.parseInt(request.getParameter("ano"));


		final Filme filme = new Filme(nome, sinopse, ano, estaDisponivel);
		final FilmeDAO filmeDao = new FilmeDAO();

		filmeDao.altera(filme);
		
		response.sendRedirect("listaFilme");

	}
}

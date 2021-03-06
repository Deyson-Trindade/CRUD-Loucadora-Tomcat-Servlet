package br.com.loucadora.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.loucadora.dao.FilmeDAO;
import br.com.loucadora.model.Filme;

@WebServlet("/listaFilme")
public class ListaFilmeServlet extends HttpServlet {

	private static final long serialVersionUID = -8785137614145017374L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		final FilmeDAO dao = new FilmeDAO();

		final List<Filme> filmes = dao.listarDisponiveis();

		request.setAttribute("filmes", filmes);

		RequestDispatcher rd = request.getRequestDispatcher("/listaFilmes.jsp");
		rd.forward(request, response);

	}

}

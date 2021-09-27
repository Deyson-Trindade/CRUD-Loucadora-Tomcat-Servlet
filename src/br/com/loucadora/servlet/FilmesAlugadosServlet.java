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


@WebServlet("/filmesAlugados")
public class FilmesAlugadosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			final FilmeDAO dao = new FilmeDAO();

			List<Filme> filmes = dao.listarAlugados();
			
			request.setAttribute("filmes", filmes);

		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("/filmesAlugados.jsp");
		rd.forward(request, response);

	}

}

package br.com.loucadora.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.loucadora.dao.FilmeDAO;

@WebServlet("/alugaFilme")
public class AlugaFilmeEtapaFinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		FilmeDAO filmeDao = new FilmeDAO();
		filmeDao.aluga(id);
			
		response.sendRedirect("listaFilme");

	}

}

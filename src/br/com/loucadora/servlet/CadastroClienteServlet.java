package br.com.loucadora.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.loucadora.dao.ClienteDAO;
import br.com.loucadora.model.Cliente;


@WebServlet("/cadastroCliente")
public class CadastroClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getRequestDispatcher("/cadastroCliente.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final String nome = request.getParameter("nome");
		final Integer cpf =Integer.parseInt(request.getParameter("cpf"));
		final String dataNascimento = request.getParameter("dataNascimento");		
		
		final Cliente cliente = new Cliente(nome, cpf, dataNascimento);
		final ClienteDAO dao = new ClienteDAO();
		
		dao.insere(cliente);
		
		response.sendRedirect("clienteCadastrado");
		
	}

}

package br.com.loucadora.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novoCliente")
public class NovoClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Deyson");
		request.setAttribute("nome", cliente.getNome());
		
		RequestDispatcher rd = request.getRequestDispatcher("/cadastroNovoCliente.jsp");
		
		rd.forward(request, response);
		
		
	}

}
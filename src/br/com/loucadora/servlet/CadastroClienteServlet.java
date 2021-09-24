package br.com.loucadora.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cadastroCliente")
public class CadastroClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		RequestDispatcher rd = request.getRequestDispatcher("/cadastraCliente.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sql = "INSERT into cliente (nome, idade, bairro, rua, cep) VALUES(?,?,?,?,?)";
		
		
	}

}

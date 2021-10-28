package br.com.loucadora.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.loucadora.dao.FuncionarioDAO;
import br.com.loucadora.model.Funcionario;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		FuncionarioDAO dao = new FuncionarioDAO();
		boolean funcionarioExiste = dao.existe(email, senha);
		Funcionario funcionario;
		
		
		if(funcionarioExiste) {
			funcionario = new Funcionario(email, senha);
			
			HttpSession sessao = request.getSession();
			sessao.setAttribute("funcionarioLogado", funcionario);
			System.out.println(sessao.getAttribute("funcionarioLogado"));
			response.sendRedirect("loucadoraSystem");
		} else {
			response.sendRedirect("login");
		}
	}

}

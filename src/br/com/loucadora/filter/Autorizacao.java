package br.com.loucadora.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/*")
public class Autorizacao implements Filter {

  	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
  		
  		HttpServletRequest request = (HttpServletRequest) servletRequest;
  		HttpServletResponse response = (HttpServletResponse) servletResponse;  		
  		
		HttpSession sessao = request.getSession();
		
		String url = request.getRequestURL().toString();
		
		String[] urlSplited = url.split("/");
		String lastPartUrl = urlSplited[urlSplited.length-1]; 
		
		
		
		if("login".equals(lastPartUrl) || url.endsWith("css")) {
			chain.doFilter(request, response);
			return;
		}
		if (sessao.getAttribute("funcionarioLogado") == null ) {

			response.sendRedirect("login");
			return;
		} 
  		
		chain.doFilter(request, response);
	}

}

package br.com.servlet.cliente;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addPessoa")
public class AdicionaPessoaSessao extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
		//getServletContext().setAttribute("servletParametro","10");
		//getServletContext().removeAttribute("servletParametro");
		//getServletContext().setAttribute("servletParametro","30");
		
		req.setAttribute("gggg", "teste");
		req.removeAttribute("gggg");

	}
}

package br.com.servlet3.cliente;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class CadastrarClienteServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();
		//System.out.println("iniciando o cadastro de cliente");

	}
	
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException		{
		String nomeCliente = request.getParameter("nome");
		Integer idadeCliente = Integer.parseInt(request.getParameter("idade"));
		
		System.out.println("cadastrou o clinte:"+nomeCliente + "Com a idade: "+ idadeCliente);
	}

}

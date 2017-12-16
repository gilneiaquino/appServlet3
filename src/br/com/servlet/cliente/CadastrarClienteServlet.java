package br.com.servlet.cliente;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/cadastrarCliente",
		"/formCliente" }, name = "primeiroServlet", description = "vai ser ele o primeiro", 
		initParams = {
				@WebInitParam(name = "cidade", value = "brasilia"), 
				@WebInitParam(name = "idadeCidade", value = "50")

}, loadOnStartup = 1)
public class CadastrarClienteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();
		// System.out.println("iniciando o cadastro de cliente");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nomeCliente = request.getParameter("nome");
		Integer idadeCliente = Integer.parseInt(request.getParameter("idade"));

		String minhaCidade = getInitParameter("cidade");

		String contextCidade = getServletContext().getInitParameter("idadeCidade");
		String configCidade = getServletConfig().getInitParameter("idadeCidade");

		System.out.println("cadastrou o clinte:" + nomeCliente + "Com a idade: " + idadeCliente);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("cadastrou o cliente");

		RequestDispatcher rd = req.getRequestDispatcher("/clienteArmazenadoTeste");

		rd.forward(req, resp);
	}

}

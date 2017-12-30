package servletContexListenerTeste;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextListenerAprendizado implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("contexto foi destruido acabou aplicação");

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("contexto foi inicializado");
	}

}

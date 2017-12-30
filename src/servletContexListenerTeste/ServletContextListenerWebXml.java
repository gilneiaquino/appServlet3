package servletContexListenerTeste;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerWebXml implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("Destruiu pelo web.xml foi destruido acabou aplicação");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("chamou pelo web.xml foi destruido acabou aplicação");
		
	}
	

}

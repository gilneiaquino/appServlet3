package servletRequestListenerTeste;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletRequestListenerTeste implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent event) {
		//System.out.println("request inicial");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
	//	System.out.println("request Fin al");

	}

}

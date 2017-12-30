package servletContextAttributeListenerTeste;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextAttributeListenerTeste implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		//System.out.println("Adicionei um atributo nome:"+event.getName());
		//System.out.println("Adicionei um atributo valor:"+event.getValue());

	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		//System.out.println("removi um atributo");
		
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
	//	System.out.println("troquei um atributo");
		
	}

}

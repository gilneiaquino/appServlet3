package br.com.servlet.login;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(dispatcherTypes= {DispatcherType.REQUEST,DispatcherType.FORWARD},
filterName="filtro1", asyncSupported=true)
public class FiltroLogin implements Filter{
	
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)throws ServletException,IOException {
    	chain.doFilter(req, resp);
    	
    }

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
    
    

}

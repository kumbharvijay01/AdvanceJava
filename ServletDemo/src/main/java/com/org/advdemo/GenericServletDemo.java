package com.org.advdemo;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class GenericServletDemo extends GenericServlet {

	@Override
	public void destroy() {
		System.out.println("Destroy Called ");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {

		System.out.println("Init Called ");
		super.init();
	}

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse)
			throws ServletException, IOException {
		System.out.println("Inside the Service Method");
		
		
	}

}

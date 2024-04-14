package com.org.radical.test;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class IndexController extends GenericServlet {

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Destroy Called");
	}

	@Override
	public void init() throws ServletException {

		super.init();
		System.out.println("Preprocessing");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		

	}

}

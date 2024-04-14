package com.pune.it.apps;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("servlet init method called");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws ServletException, IOException {
		System.out.println("inside service method");
		// super.service(arg0, arg1);
	}

	@Override
	public void destroy() {
		System.out.println("servlet destroy method called");
		super.destroy();
	}

}

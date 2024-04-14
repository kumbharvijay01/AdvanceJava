package com.org.test.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest httpServletRequest, ServletResponse httpServletResponse)
			throws ServletException, IOException {
		System.out.println(httpServletRequest.getParameter("username"));
		PrintWriter out = httpServletResponse.getWriter();
		httpServletResponse.setContentType("text/html");
		out.print("Welcome to Java EE World<br>");
		out.print("<h1>" + httpServletRequest.getParameter("username") + "</h1>");

	}

}

package com.pune.it.apps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterDemo implements Filt {

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse)
			throws ServletException, IOException {
		System.out.println("Service Method Called");
		servletResponse.setContentType("text/html");
		PrintWriter out = servletResponse.getWriter();
		out.print("<br>welcome to servlet<br>");

	}

}

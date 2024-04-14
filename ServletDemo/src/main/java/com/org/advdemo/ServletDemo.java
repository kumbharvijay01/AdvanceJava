package com.org.advdemo;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet {

	public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		httpServletResponse.setContentType("text/html");
		
		 // Actual logic goes here.
	      PrintWriter out = httpServletResponse.getWriter();
	      out.println("<h1>" + message + "</h1>");

	}

}

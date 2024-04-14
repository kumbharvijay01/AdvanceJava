/**
 * 
 */
package com.org.radical.myapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 */

public class LoginFilter implements Filter {

	@Override
	public void destroy() {

		Filter.super.destroy();
		System.out.println("Filter DESTROY Called");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		System.out.println("Filter Called");
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		if (!uname.equals("")) {
			filter.doFilter(request, response);
		} else {
			response.setContentType("text/html");
			// Actual logic goes here.
			PrintWriter out = response.getWriter();
			out.println("<h1> You have entered Wrong UserName  " + uname + " Kindly valiate and retry</h1>");
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Filter.super.init(filterConfig);
		System.out.println("Filter INIT Called");
	}

}

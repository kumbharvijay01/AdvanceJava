/**
 * 
 */
package com.org.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * 
 */

@WebFilter(urlPatterns = "/Login")
public class LoginFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {

		System.out.println(request.getParameter("username"));
		if (request.getParameter("username").equalsIgnoreCase("admin")) {
			filterChain.doFilter(request, response);
		} else {
			PrintWriter out = response.getWriter();
			out.print("Session Expired");

		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}

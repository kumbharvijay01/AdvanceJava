/**
 * 
 */
package com.org.radical.TestingWeb;

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
@WebFilter(filterName = "LoginFilter", value = { "/login" })
public class LoginFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println(request.getParameter("uname"));
		if (request.getParameter("uname").equals("User")) {
			filterChain.doFilter(request, response);
		} else {
			PrintWriter out = response.getWriter();
			out.print("You Are not Authorize");
			System.out.println("Unable to trigger the Login Servlet");
		}
	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}

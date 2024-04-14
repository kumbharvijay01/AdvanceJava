/**
 * 
 */
package com.org.radical.webmodule;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
public class LoginServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("Init Called");
		super.init();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		super.doPost(req, resp);

		System.out.println("POST Called" + req.getParameter("username"));
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Destroy Called");
	}

}

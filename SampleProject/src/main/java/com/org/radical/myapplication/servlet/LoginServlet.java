/**
 * 
 */
package com.org.radical.myapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.org.radical.myapplication.model.Users;
import com.org.radical.myapplication.service.impl.LoginServiceImpl;

/**
 * 
 */
public class LoginServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		LoginServiceImpl loginServiceImpl = new LoginServiceImpl();
		Users users = loginServiceImpl.getUser(uname, password);
		out.println("<h1> Welcome " + users.toString() + "</h1>");
	}

	@Override
	public void destroy() {
		System.out.println("Destroy Called");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Init Called ");
		super.init();
	}

}

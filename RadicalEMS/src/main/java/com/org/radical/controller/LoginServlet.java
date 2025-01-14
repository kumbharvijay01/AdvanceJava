/**
 * 
 */
package com.org.radical.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 
 */

public class LoginServlet extends HttpServlet {

//	@Override
//	protected void doGet(jakarta.servlet.http.HttpServletRequest req, jakarta.servlet.http.HttpServletResponse resp)
//			throws jakarta.servlet.ServletException, IOException {
//		System.out.println("Get Method Called");
//		String name = req.getParameter("uname");
//		PrintWriter out = resp.getWriter();
//		if (name.equalsIgnoreCase("admin")) {
//			out.write("<h1> Welcome " + req.getParameter("uname") + " </h1> " + req.getContentType());
//		} else {
//			out.write("<h1> Wrong Username provided </h1>");
//		}
//
//	}

	@Override
	public void destroy() {
		System.out.println("Destroy Called Once");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get Method Called");
		String name = req.getParameter("uname");
		PrintWriter out = resp.getWriter();
		if (name.equalsIgnoreCase("admin")) {
			out.write("<h1> Welcome " + req.getParameter("uname") + " </h1> " + req.getContentType());
		} else {
			out.write("<h1> Wrong Username provided </h1>");
		}
	}

	@Override
	public void init() throws jakarta.servlet.ServletException {
		System.out.println("Init Called Once");
	}

}

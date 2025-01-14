/**
 * 
 */
package com.org.radical.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 
 */
@WebServlet(value = "/forget", description = "Forget Password", displayName = "Forget Name")
public class ForgetPasswordServlet extends jakarta.servlet.http.HttpServlet {
	int count = 0;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Forget Password Called" + new Date());
		PrintWriter out = resp.getWriter();
		out.print(count++);
		out.println(req.getLocalAddr());
		out.println(req.getMethod());
		out.println(req.getRemotePort());
		out.println(req.getRequestURI());
	}

}

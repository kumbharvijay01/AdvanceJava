/**
 * 
 */
package com.org.radical.testapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * 
 */

public class IndexServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet Called");
		System.out.println(req.getRemoteAddr());
		System.out.println(req.getContextPath());
		System.out.println(req.getMethod());
		if (req.getMethod().equalsIgnoreCase("GET")) {
			System.out.println("I have allowed GET");
			PrintWriter out = resp.getWriter();
			Employee employee = new Employee();
			employee.setId(1);
			employee.setName("Aditi");
			employee.setActiveFlag(true);
			employee.setAddress("Pune");
			employee.setAge(30);
			Gson gson = new Gson();
			out.println(gson.toJson(employee));
		}
	}

	@Override
	public void destroy() {
		System.out.println("Destroy Called");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Init Called");
		super.init();
	}

}

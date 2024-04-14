/**
 * 
 */
package com.org.test.login;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author vijaykumbhar
 *
 */
public class IndexLogin extends GenericServlet {

	@Override
	public void init() {
		System.out.println("Inside Init");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Inside Web Development");

	}

	@Override
	public void destroy() {
		System.out.println("Inside destroy");
	}

}

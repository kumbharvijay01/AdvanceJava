/**
 * 
 */
package com.org.radical.myapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * 
 */

@WebServlet(urlPatterns = "/request", name = "RequestHeaderExample")
public class RequestHeaderExampleServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		super.doGet(request, response);
//		PrintWriter out = response.getWriter();
//		out.println("<h1> request.getContextPath():  " + request.getContextPath() + "</h1>");
//		out.println("<h1> request.getAuthType():  " + request.getAuthType() + "</h1>");
//		out.println("<h1> request.getCharacterEncoding():  " + request.getCharacterEncoding() + "</h1>");
//		out.println("<h1> request.getContentType():  " + request.getContentType() + "</h1>");
//		out.println("<h1> request.getContextPath():  " + request.getContextPath() + "</h1>");
//	}

//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doPost(req, resp);
//		PrintWriter out = resp.getWriter();
//		out.println("<h1> request.getContextPath():  " + req.getContextPath() + "</h1>");
//		out.println("<h1> request.getAuthType():  " + req.getAuthType() + "</h1>");
//		out.println("<h1> request.getCharacterEncoding():  " + req.getCharacterEncoding() + "</h1>");
//		out.println("<h1> request.getContentType():  " + req.getContentType() + "</h1>");
//		out.println("<h1> request.getContextPath():  " + req.getContextPath() + "</h1>");
//	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	@Override
	public void service(ServletRequest req, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = arg1.getWriter();
		out.println("<h1> request.getContextPath():  " + req.getContentLength() + "</h1>");
		out.println("<h1> request.getAuthType():  " + req.getContentType() + "</h1>");
		out.println("<h1> request.getCharacterEncoding():  " + req.getCharacterEncoding() + "</h1>");
		out.println("<h1> request.getContentType():  " + req.getContentType() + "</h1>");
		out.println("<h1> request.getLocalAddr():  " + req.getLocalAddr() + "</h1>");
		out.println("<h1> LocalPort:  " + req.getLocalPort() + "</h1>");
		out.println("<h1> getProtocol:  " + req.getProtocol() + "</h1>");
		out.println("<h1> getProtocol:  " + req.getRealPath(getServletInfo()) + "</h1>");
		out.println("<h1> getServerName:  " + req.getServerName() + "</h1>");
		out.println("<h1> Locale:  " + req.getLocale() + "</h1>");

	}

	@Override
	public void destroy() {
		super.destroy();
	}

}

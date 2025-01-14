/**
 * 
 */
package com.org.radical.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import jakarta.servlet.annotation.WebFilter;

/**
 * 
 */
@WebFilter(urlPatterns = "/login", description = "Login Filter", filterName = "Login Filter Example")
public class LoginFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		String psw = request.getParameter("psw");
		PrintWriter out = response.getWriter();
		if (psw.equalsIgnoreCase("admin")) {
			filterChain.doFilter(request, response);
		} else {
			System.out.println("Failed");

		}
//		boolean result = false;
//		try {
//			if (psw != null) {
//				String MIN_LENGTH = "8";
//				String MAX_LENGTH = "20";
//				boolean SPECIAL_CHAR_NEEDED = false;
//				String ONE_DIGIT = "(?=.*[0-9])";
//				String LOWER_CASE = "(?=.*[a-z])";
//				String UPPER_CASE = "(?=.*[A-Z])";
//				String SPECIAL_CHAR = SPECIAL_CHAR_NEEDED ? "(?=.*[@#$%^&+=])" : "";
//				String NO_SPACE = "(?=\\S+$)";
//
//				String MIN_MAX_CHAR = ".{" + MIN_LENGTH + "," + MAX_LENGTH + "}";
//				String PATTERN = ONE_DIGIT + LOWER_CASE + UPPER_CASE + SPECIAL_CHAR + NO_SPACE + MIN_MAX_CHAR;
//				result = psw.matches(PATTERN);
//				if (result) {
//					filterChain.doFilter(request, response);
//				} else {
//					out.println("Password Policy does't Match");
//				}
//			}
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			out.println("Exception occurred: " + ex.getMessage());
//		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

}

/**
 * 
 */
package com.org.radical.TestingWeb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.radical.TestingWeb.dto.LoginRequestDto;
import com.org.radical.TestingWeb.service.impl.LoginServiceImpl;
import com.org.radical.TestingWeb.util.DbConnection;

/**
 * 
 */
@WebServlet(name = "Login", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// System.out.println("DoGet Called ");
		PrintWriter out = resp.getWriter();
		LoginServiceImpl loginServiceImpl = new LoginServiceImpl();

		Connection connection = DbConnection.getConnection();
		try {
			Statement statement = connection.createStatement();
			LoginRequestDto loginRequestDto = new LoginRequestDto();
			loginRequestDto.setUname(req.getParameter("uname"));
			loginRequestDto.setPassword(req.getParameter("psw"));
			boolean validFlag = loginServiceImpl.validate(loginRequestDto);
			if (validFlag) {
				ResultSet resultSet = statement.executeQuery("select * from onboarding_document_master");
				while (resultSet.next()) {
					out.print("<b>" + "KeyName :	" + resultSet.getString("key_name") + " Path  "
							+ resultSet.getString("path") + "</b><hr><br>");
				}
			} else {
				out.print("<b>Sorry You are not authorse to access requested Data</b>");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void destroy() {
		super.destroy();

		System.out.println("Destroy Called ");
	}

	@Override
	public void init() throws ServletException {

		super.init();

		System.out.println("Init Called ");
	}

}

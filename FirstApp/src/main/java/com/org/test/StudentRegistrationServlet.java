/**
 * 
 */
package com.org.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.org.jdbc.study.connection.CommonConnection;

/**
 * @author vijaykumbhar
 *
 */
public class StudentRegistrationServlet extends GenericServlet {

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

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String password = "Welcome@129#2022";

			Connection connection = DriverManager.getConnection(url, user, password);
			Statement stmt = connection.createStatement();
			int rowupdate = stmt
					.executeUpdate("iNSERT INTO student " + "(NAME) VALUES('" + request.getParameter("fname") + "')");

			PrintWriter out = response.getWriter();
			String fname, lname, mname;
			fname = request.getParameter("fname");
			mname = request.getParameter("mname");
			lname = request.getParameter("lname");
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("<table><th><td> ID</td></th><th><td> NAME</td></th>");

			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM student");
			while (rs.next()) {
				stringBuilder.append("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td></tr>");
			}
			stringBuilder.append("</table>");
			out.print(stringBuilder.toString());

		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

}

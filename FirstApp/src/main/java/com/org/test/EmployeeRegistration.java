/**
 * 
 */
package com.org.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class EmployeeRegistration extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("You Are in EmployeeRegistration");
		String name = req.getParameter("name");
		String salary = req.getParameter("salary");
		Long grossSalary = Long.parseLong(salary);
		Long incentive = grossSalary / 100 * 30;
		Long totalSalary = grossSalary + incentive;
		System.out.println("Net Salary for the " + name + "  is " + totalSalary);
		try {			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String password = "Welcome@129#2022";

			Connection connection = DriverManager.getConnection(url, user, password);
			Statement stmt = connection.createStatement();
			int rownum = 3;
			String query = "INSERT INTO student (name) values (" + "'" + name + "')";
			System.out.println(query);
			int a = stmt.executeUpdate("INSERT INTO student (name) values (" + "'" + name + "')");
			System.out.println("Row Updated " + a);
			ResultSet resultSet = stmt.executeQuery("select * from employee where employeefName='" + name + "'");
			boolean loginFlag = false;
			while (resultSet.next()) {
				loginFlag = true;
			}
			if (loginFlag) {
				System.out.println("You Are eligible to Login in Application");
			} else {
				System.out.println("You Are Not eligible to Login in Application");
			}

		} catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

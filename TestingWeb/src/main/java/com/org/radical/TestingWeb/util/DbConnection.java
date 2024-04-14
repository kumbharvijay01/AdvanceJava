/**
 * 
 */
package com.org.radical.TestingWeb.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 */

public class DbConnection {

	public static final String url = "jdbc:mysql://localhost:3306/development";
	public static final String userName = "root";
	public static final String password = "Welcome@129#2022";
	public static final String driverName = "com.mysql.cj.jdbc.Driver";
//	
//	spring.datasource.url=jdbc:mysql://localhost:3306/development
//		spring.datasource.username=root
//		spring.datasource.password=Welcome@129#2022
//		spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection Object " + connection);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return connection;

	}

}

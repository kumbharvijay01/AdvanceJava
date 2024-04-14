/**
 * 
 */
package com.org.radical.myapplication.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 */
public class MySQLConnection {

	public Connection getConnection() {

		Connection connection = null;
		DBProperties dbProperties = new DBProperties();
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Loaded");
				connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getUserName(),
						dbProperties.getPassword());
				System.out.println("Connection Created Successfully ");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return connection;

	}

}

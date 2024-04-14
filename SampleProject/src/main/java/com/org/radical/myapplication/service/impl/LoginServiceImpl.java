/**
 * 
 */
package com.org.radical.myapplication.service.impl;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.org.radical.myapplication.db.MySQLConnection;
import com.org.radical.myapplication.model.Users;

/**
 * 
 */
public class LoginServiceImpl implements LoginService {

	@Override
	public Users getUser(String username, String password) {
		Users users = new Users();
		MySQLConnection mySQLConnection = new MySQLConnection();
		Connection connection = mySQLConnection.getConnection();

		try (PreparedStatement preparedStatement = connection
				.prepareStatement("select * from users where username=?")) {
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				users.setUsername(resultSet.getString("username"));
				users.setPassword(resultSet.getString("password"));
				users.setEmail(resultSet.getString("email"));
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return users;
	}
}

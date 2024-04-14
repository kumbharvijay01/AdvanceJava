/**
 * 
 */
package com.org.radical.TestingWeb.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.org.radical.TestingWeb.dto.LoginRequestDto;
import com.org.radical.TestingWeb.service.LoginService;
import com.org.radical.TestingWeb.util.DbConnection;

/**
 * 
 */
public class LoginServiceImpl implements LoginService {

	public boolean validate(LoginRequestDto loginRequestDto) {
		Connection connection = DbConnection.getConnection();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from users where username=? and password=?");
			preparedStatement.setString(1, loginRequestDto.getUname());
			preparedStatement.setString(2, loginRequestDto.getPassword());
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				return true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

}

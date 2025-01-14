/**
 * 
 */
package com.org.radical.TestingWeb.dto;

/**
 * 
 */

public class LoginRequestDto {

	private String uname;
	private String password;

	public LoginRequestDto(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}

	public LoginRequestDto() {
		super();
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginRequestDto [uname=" + uname + ", password=" + password + "]";
	}

}

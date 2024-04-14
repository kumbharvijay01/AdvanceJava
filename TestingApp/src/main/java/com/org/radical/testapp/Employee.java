/**
 * 
 */
package com.org.radical.testapp;

/**
 * 
 */
public class Employee {

	private int id;
	private String name;
	private boolean activeFlag;
	private String address;
	private int age;

	public Employee() {
		super();
	}

	public Employee(int id, String name, boolean activeFlag, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.activeFlag = activeFlag;
		this.address = address;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", activeFlag=" + activeFlag + ", address=" + address
				+ ", age=" + age + "]";
	}

}

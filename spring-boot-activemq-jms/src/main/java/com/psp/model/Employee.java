package com.psp.model;

import java.io.Serializable;

public class Employee implements Serializable {

	private String employeeId;
	private String employeeNm;
	private int age;
	private String city;
	private String state;
	private String country;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeNm() {
		return employeeNm;
	}

	public void setEmployeeNm(String employeeNm) {
		this.employeeNm = employeeNm;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeNm=" + employeeNm + ", age=" + age + ", city=" + city
				+ ", state=" + state + ", country=" + country + "]";
	}

}

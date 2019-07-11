package com.cts.beans;

import java.util.Date;

public class User {
	private String fullName;
	private String username;
	private String password;
	private String gender;
	private String email;
	private Date dob;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public User(String fullName, String username, String password, String gender, String email, Date dob) {
		super();
		this.fullName = fullName;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.email = email;
		this.dob = dob;
	}
	

}

package com.sachin.demo;

public class User {
	
	String userName;
	String password;
	
	public User(){
		
	}
	
	public User(String v1, String v2) {
		
		this.userName=v1;
		this.password=v2;
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

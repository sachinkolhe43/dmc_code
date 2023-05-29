package com.sachin.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table (name="users")
public class User {
	
	@Id
	@Column(name="userid")
	String userId;
	
	@Column(name="password")
	String password;
	
	public User() {
		
	}
	
	public User(String v1, String v2) {
		
		this.userId=v1;
		this.password=v2;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

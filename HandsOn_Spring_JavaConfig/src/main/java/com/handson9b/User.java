package com.handson9b;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String name;
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void display() {
		System.out.println(name+"\t"+password);
	}
}

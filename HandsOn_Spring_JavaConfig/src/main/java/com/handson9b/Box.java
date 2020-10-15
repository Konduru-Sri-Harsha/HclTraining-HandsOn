package com.handson9b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Box {
	private User user;
	private int length;
	private int width;
	
	public Box() {
		// TODO Auto-generated constructor stub
	}

	public User getUser() {
		return user;
	}
	
	@Autowired
	public void setUser(User user) {
		this.user = user;
	}

	public int getLength() {
		return length;
	}
	
	@Required
	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}
	
	@Required
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void display() {
		
		System.out.println("The hall of length "+length+" and width "+width+" owned by "+user.getName());
	}
}

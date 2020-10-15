package com.handson9b;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoxConfig {
	
	@Bean(name="user")
	public User getUser() {
		User user= new User();
		user.setName("Surya");
		user.setPassword("surya");
		
		return user;
	}
	
	@Bean(name="box")
	public Box getBox() {
		Box box= new Box();
		box.setLength(10);
		box.setWidth(20);
		
		return box;
	}
}

package com.handson7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	
	@Bean(name="user")
	public User getUser() {
		User user= new User();
		user.setName("Jagan");
		user.setAge(24);
		user.setCity("Chennai");
		
		return user;
		
	}
	@Bean(name="orderOne")
	public Order getOrder1() {
		Order order= new Order();
		order.setItemName("Item1");
		order.setPrice(230.07);
		
		return order;
	}
	
	@Bean(name="orderTwo")
	public Order getOrder2() {
		Order order= new Order();
		order.setItemName("Item2");
		order.setPrice(300.50);
		
		return order;
	}

}

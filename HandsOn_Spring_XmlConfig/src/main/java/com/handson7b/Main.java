package com.handson7b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext7.xml");
		User user= context.getBean(User.class,"user");
		
		user.display();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}

package com.handson7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new AnnotationConfigApplicationContext(UserConfig.class);
		User user= context.getBean(User.class,"user");
		
		user.display();
		((AnnotationConfigApplicationContext) context).close();
	
	}

}

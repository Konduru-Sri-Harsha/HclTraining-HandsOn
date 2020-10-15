package com.handson9b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new AnnotationConfigApplicationContext(BoxConfig.class);
		Box box= context.getBean("box",Box.class);
		
		box.display();
		
		((AnnotationConfigApplicationContext) context).close();
	}

}

package com.handson9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext9.xml");
		Box box= context.getBean("box",Box.class);
		
		box.display();
	}

}

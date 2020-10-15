package com.handson8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext8.xml");
		Course course1 = context.getBean("course1", Course.class);
		Course course2 = context.getBean("course2", Course.class);
		Course course3 = context.getBean("course3", Course.class);
		
		course1.display();
		course2.display();
		course3.display();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}

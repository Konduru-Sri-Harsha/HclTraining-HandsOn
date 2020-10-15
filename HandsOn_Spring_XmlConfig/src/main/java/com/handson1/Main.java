package com.handson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = context.getBean(Employee.class, "employee");
		employee.display();
		((ClassPathXmlApplicationContext) context).close();
	}
	
}

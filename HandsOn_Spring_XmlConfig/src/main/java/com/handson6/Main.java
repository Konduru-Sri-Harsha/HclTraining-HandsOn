package com.handson6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee employee = context.getBean(Employee.class,"employee");
		employee.display();
		((AnnotationConfigApplicationContext) context).close();
	}

}

package com.handson3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseList courseList = new CourseList();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

		Course course1 = context.getBean("course1", Course.class);
		Course course2 = context.getBean("course2", Course.class);
		Course course3 = context.getBean("course3", Course.class);

		courseList.insert(course1);
		courseList.insert(course2);
		courseList.insert(course3);

		courseList.discount();
		((ClassPathXmlApplicationContext) context).close();
	}

}

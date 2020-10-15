package com.handson3b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseList courseList = new CourseList();
		ApplicationContext context = new AnnotationConfigApplicationContext(CourseConfig.class);

		Course course1 = context.getBean("course1", Course.class);
		Course course2 = context.getBean("course2", Course.class);
		Course course3 = context.getBean("course3", Course.class);

		courseList.insert(course1);
		courseList.insert(course2);
		courseList.insert(course3);

		courseList.discount();
		((AnnotationConfigApplicationContext) context).close();
	}

}

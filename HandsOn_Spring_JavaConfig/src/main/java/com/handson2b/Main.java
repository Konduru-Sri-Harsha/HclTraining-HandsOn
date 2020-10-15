package com.handson2b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		CourseList courselist = new CourseList();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();

		ApplicationContext context = new AnnotationConfigApplicationContext(CourseConfig.class);

		Course course1 = context.getBean("course1", Course.class);
		Course course2 = context.getBean("course2", Course.class);
		Course course3 = context.getBean("course3", Course.class);

		courselist.insert(course1);
		courselist.insert(course2);
		courselist.insert(course3);

		System.out.println("Enter your budget:");
		Double budget = Double.parseDouble(br.readLine());
		list = courselist.noOfCourse(budget);
		if (list.isEmpty())
			System.out.println("No Courses Available");
		else {
			for (String available : list) {
				System.out.println(available);
			}
		}
		((AnnotationConfigApplicationContext) context).close();

	}

}

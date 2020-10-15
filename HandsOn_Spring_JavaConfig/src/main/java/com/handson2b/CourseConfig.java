package com.handson2b;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CourseConfig {
	
	@Bean(name="course1")
	public Course getCourse1() {
		Course course= new Course();
		course.setName("Java");
		course.setMentor("Sathish");
		course.setFee(1000.00);
		
		return course;
	}
	
	@Bean(name="course2")
	public Course getCourse2() {
		Course course= new Course();
		course.setName("Selinium");
		course.setMentor("Kanimozhi");
		course.setFee(2500.00);
		
		return course;
	}
	
	@Bean(name="course3")
	public Course getCourse3() {
		Course course= new Course();
		course.setName("Python");
		course.setMentor("Arun");
		course.setFee(500.00);
		
		return course;
	}
}

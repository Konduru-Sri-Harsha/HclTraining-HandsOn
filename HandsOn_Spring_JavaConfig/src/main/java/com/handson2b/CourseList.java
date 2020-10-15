package com.handson2b;

import java.util.ArrayList;


public class CourseList {
	private ArrayList<Course> courseList= new ArrayList<Course>();
	
	public void insert(Course course) {
		
		courseList.add(course);
	}
	
	public ArrayList<String> noOfCourse(Double budget) {
		
		ArrayList<String> list= new ArrayList<String>();
		for(Course course : courseList) {
			String name=course.getName();
			Double fee= course.getFee();
			if(budget>=fee) {
				list.add(name+"-"+(int)(budget/fee));
			}
		}
		
		return list;
		
	}
}

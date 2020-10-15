package com.handson4;

import java.util.ArrayList;

public class CourseList {
	private ArrayList<Course> courseList = new ArrayList<Course>();

	public void insert(Course course) {

		courseList.add(course);
	}

	public void revenue() {
		double revenue = 0;
		for (Course course : courseList) {
			double fee = course.getFee();
			revenue += (fee * 200 * 0.2);
		}

		System.out.println("Total Revenue: " + revenue);
	}

}

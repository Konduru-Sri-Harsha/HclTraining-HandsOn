package com.handson3;

import java.util.ArrayList;

public class CourseList {
	private ArrayList<Course> courseList = new ArrayList<Course>();

	public void insert(Course course) {

		courseList.add(course);
	}

	public void discount() {
		double min = 99999, max = 0;
		String minCourse = null, maxCourse = null;
		for (Course course : courseList) {
			double fee = course.getFee();
			if (fee < min) {
				min = fee;
				minCourse = course.getName();
			} else if (fee > max) {
				max = fee;
				maxCourse = course.getName();
			}
		}
		System.out.println("Discount " + (max * 0.1) + " for " + maxCourse+" course.");
		System.out.println("Discount " + (min * 0.05) + " for " + minCourse+" course.");
	}
}

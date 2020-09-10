package com.hcl4;

public class Circle extends Shape {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void computeArea() {
		area = (22 * radius * radius) / 7;
		System.out.format("Area of circle:%.2f", area);

	}
}

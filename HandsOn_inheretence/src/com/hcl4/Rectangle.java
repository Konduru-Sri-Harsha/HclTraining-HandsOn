package com.hcl4;

public class Rectangle extends Shape {
	private double length;
	private double breadth;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public void computeArea() {
		area = length * breadth;
		System.out.format("Area of rectangle:%.2f", area);
	}

}

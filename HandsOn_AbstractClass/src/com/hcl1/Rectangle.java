package com.hcl1;

public class Rectangle extends Shape {
	private float length;
	private float breadth;
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	@Override
	public Double calculatePerimeter() {
		double p = length*breadth;
		return p;
	}

}

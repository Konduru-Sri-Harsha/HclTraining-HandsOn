package com.hcl4;

public class Triangle extends Shape {
	private double base;
	private double height;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void computeArea() {
		area = (0.5) * (base * height);
		System.out.format("Area of triangle:%.2f", area);
	}
}

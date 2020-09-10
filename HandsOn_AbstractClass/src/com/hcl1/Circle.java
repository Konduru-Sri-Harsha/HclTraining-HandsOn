package com.hcl1;

public class Circle extends Shape {
	private float radius;
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	@Override
	public Double calculatePerimeter() 
	{
		double p = 2*(3.14)* radius;
		return p;
	}
	
}

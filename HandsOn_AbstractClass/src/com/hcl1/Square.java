package com.hcl1;

public class Square extends Shape {
	private float side;
	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
	}
	@Override
	public Double calculatePerimeter() {
		
		double p = side*side;
		return p;
		
	}

}

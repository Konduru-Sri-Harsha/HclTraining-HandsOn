package com.polygon;

public class Square implements Polygon {
	double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public void calPeri() {
		// TODO Auto-generated method stub
		double peri = 4 * side;
		System.out.println("The perimeter of Square is: " + peri);
	}

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		double area = side * side;
		System.out.println("The area of Square is: " + area);
	}

}

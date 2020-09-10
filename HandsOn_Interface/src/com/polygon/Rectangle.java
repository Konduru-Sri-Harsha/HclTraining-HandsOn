package com.polygon;

public class Rectangle implements Polygon {
	double length;
	double breadth;

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

	@Override
	public void calPeri() {
		// TODO Auto-generated method stub
		double peri = 2 * (length + breadth);
		System.out.println("The perimeter of Rectangle is: " + peri);
	}

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		double area = length * breadth;
		System.out.println("The area of Reactangke is: " + area);

	}

}

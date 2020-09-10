package com.hcl4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the shape\n" + "1.Circle\n" + "2.Rectangle\n" + "3.Triangle\n");
		int choice = Integer.parseInt(br.readLine());
		switch (choice) {
		case 1:
			Circle c = new Circle();
			System.out.println("Enter the radius:");
			double radius = Double.parseDouble(br.readLine());
			c.setRadius(radius);
			c.computeArea();
			break;
		case 2:
			Rectangle r = new Rectangle();
			System.out.println("Enter lenght and breadth");
			double length = Double.parseDouble(br.readLine());
			double breadth = Double.parseDouble(br.readLine());
			r.setLength(length);
			r.setBreadth(breadth);
			r.computeArea();
			break;
		case 3:
			Triangle t = new Triangle();
			System.out.println("Enter base and height");
			double base = Double.parseDouble(br.readLine());
			double height = Double.parseDouble(br.readLine());
			t.setBase(base);
			t.setHeight(height);
			t.computeArea();
			break;

		default:
			System.out.println("Invalid choice");

		}

	}

}

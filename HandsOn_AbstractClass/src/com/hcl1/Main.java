package com.hcl1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("List of Shapes:\n" + "1.Circle\n" + "2.Rectangle\n" + "3.Square\n" );
		System.out.println("Enter your choice:");
		int choice = Integer.parseInt(br.readLine());
		
		switch(choice) {
		      
		case 1:
			Circle c= new Circle();
			System.out.println("Enter the radius of circle:");
			float rad= Float.parseFloat(br.readLine());
			c.setRadius(rad);
			double pc=c.calculatePerimeter();
			System.out.format("The Perimeter is:%.2f",pc);
			break;
		case 2:
			Rectangle r= new Rectangle();
			System.out.println("Enter length of rectangle:");
			float len= Float.parseFloat(br.readLine());
			r.setLength(len);
			System.out.println("Enter breadth of rectangle:");
			float bre= Float.parseFloat(br.readLine());
			r.setBreadth(bre);
			double pr=r.calculatePerimeter();
			System.out.format("The perimeter is:%.2f", pr);
			break;
		case 3:
			Square s= new Square();
			System.out.println("Enter side of square:");
			float side= Float.parseFloat(br.readLine());
			s.setSide(side);
			double ps= s.calculatePerimeter();
			System.out.format("The perimeter is:%.2f",ps);
			break;
		
		
		}
		
	}

}

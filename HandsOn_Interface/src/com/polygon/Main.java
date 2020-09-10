package com.polygon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Square s = new Square();
		Rectangle r = new Rectangle();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the lenght and breadth");
		double l = Double.parseDouble(br.readLine());
		double b = Double.parseDouble(br.readLine());
		r.setBreadth(b);
		r.setLength(l);
		System.out.println("Enter side:");
		double side = Double.parseDouble(br.readLine());
		s.setSide(side);
		r.calPeri();
		r.calArea();
		s.calPeri();
		s.calArea();

	}

}

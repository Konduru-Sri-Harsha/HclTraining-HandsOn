package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter venue name");
		String name = s.nextLine();
		System.out.println("Enter city name");
		String city = s.nextLine();

		Venue v1 = new Venue();
		v1.setName(name);
		v1.setCity(city);

		System.out.println("Venue details");
		System.out.println("venue name:" + v1.getName() + "\n" + "city name:" + v1.getCity());

	}

}

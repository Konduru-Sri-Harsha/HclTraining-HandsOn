package com.hcl5;

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
		System.out.println("Verify and Update Venue Details " + "\n" + "Menu");
		System.out.println("1.Update Venue Name ");
		System.out.println("2.Update City Name ");
		System.out.println("3.All informations Correct/Exit ");
		System.out.println("Type 1 or 2 or 3 ");
		int i;
		do {
			i = s.nextInt();

			switch (i) {
			case 1:
				Scanner newname = new Scanner(System.in);
				System.out.println("Venue details");
				String x = newname.nextLine();
				v1.setName(x);
				System.out.println("venue name:" + v1.getName() + "\n" + "city name:" + v1.getCity());
				System.out.println("Verify and Update Venue Details " + "\n" + "Menu");
				System.out.println("1.Update Venue Name ");
				System.out.println("2.Update City Name ");
				System.out.println("3.All informations Correct/Exit ");
				System.out.println("Type 1 or 2 or 3 ");
				break;
			case 2:
				Scanner newcity = new Scanner(System.in);
				System.out.println("Enter city name");
				String y = newcity.nextLine();
				v1.setCity(y);
				System.out.println("Venue details");
				System.out.println("venue name:" + v1.getName() + "\n" + "city name:" + v1.getCity());
				System.out.println("Verify and Update Venue Details " + "\n" + "Menu");
				System.out.println("1.Update Venue Name ");
				System.out.println("2.Update City Name ");
				System.out.println("3.All informations Correct/Exit ");
				System.out.println("Type 1 or 2 or 3 ");
				break;

			case 3:
				System.out.println("venue name:" + v1.getName());
				System.out.println("city name:" + v1.getCity());
				break;
			default:
				System.out.println("Not valid number");

			}
		} while (i <= 3);
	}

}

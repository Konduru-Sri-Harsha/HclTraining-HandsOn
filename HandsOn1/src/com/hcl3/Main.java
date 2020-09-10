package com.hcl3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the over");
		Long over = s.nextLong();
		System.out.println("Enter the ball");
		Long ball = s.nextLong();
		System.out.println("Enter the runs");
		Long runs = s.nextLong();
		s.nextLine();
		System.out.println("Enter batsman name");
		String batsman = s.nextLine();
		System.out.println("Enter bowler name");
		String bowler = s.nextLine();
		System.out.println("Enter the nonstriker ");
		String nonStriker = s.nextLine();

		Delivery d = new Delivery(over, ball, runs, batsman, bowler, nonStriker);

		d.displayDeliveryDetails();
	}
}
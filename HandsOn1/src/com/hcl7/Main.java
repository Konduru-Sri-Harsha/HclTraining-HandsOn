package com.hcl7;

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

		System.out.println("Delivery Details");

		Delivery d = new Delivery(over, ball, runs, batsman, bowler, nonStriker);
		d.setOver(over);
		d.setBall(ball);
		d.setRuns(runs);
		d.setBatsman(batsman);
		d.setBowler(bowler);
		d.setNonStriker(nonStriker);

		System.out.println("Over:" + d.getOver());
		System.out.println("Ball:" + d.getBall());
		System.out.println("Runs:" + d.getRuns());
		System.out.println("Batsman:" + d.getBatsman());
		System.out.println("Bowler:" + d.getBowler());
		System.out.println("NonStriker:" + d.getNonStriker());

	}
}
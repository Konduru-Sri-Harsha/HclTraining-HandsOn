package com.hcl8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of wickets");
		int i = s.nextInt();
		int x;
		int j;

		Wicket w = new Wicket();
		String[] str = new String[10];

		for (x = 1; x <= i; x++) {
			Scanner st = new Scanner(System.in);
			System.out.println("Enter the details of wicket" + x + ":");
			str[x - 1] = st.nextLine();

		}
		System.out.println("Wicket details:");

		for (j = 0; j < i; j++) {

			String[] wic = str[j].split(",", 5);

			Long ov = Long.parseLong(wic[0]);
			Long ba = Long.parseLong(wic[1]);

			w.setOver(ov);
			w.setBall(ba);
			w.setWicketType(wic[2]);
			w.setPlayerName(wic[3]);
			w.setBowlerName(wic[4]);

			System.out.println("Over:" + w.getOver());
			System.out.println("Ball:" + w.getBall());
			System.out.println("Wicket Type:" + w.getWicketType());
			System.out.println("Player Name:" + w.getPlayerName());
			System.out.println("Bowler Name:" + w.getBowlerName());

		}
	}

}

package com.hcl4;

import java.util.Scanner;

import com.hcl2.Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Player p1 = new Player();
		System.out.println("Enter player details");
		String str = s.nextLine();
		String details[] = str.split(",", 3);

		p1.setName(details[0]);
		p1.setCountry(details[1]);
		p1.setSkill(details[2]);

		System.out.println("Player details");
		System.out.println("Enter player name:" + p1.getName());
		System.out.println("Enter country name:" + p1.getCountry());
		System.out.println("Enter skill:" + p1.getSkill());

	}

}

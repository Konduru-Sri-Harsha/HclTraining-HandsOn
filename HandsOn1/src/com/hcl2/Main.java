package com.hcl2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter player name");
		String name = s.nextLine();
		System.out.println("Enter country name");
		String country = s.nextLine();
		System.out.println("Enter the skill ");
		String skill = s.nextLine();

		Player p1 = new Player();
		p1.setName(name);
		p1.setCountry(country);
		p1.setSkill(skill);

		System.out.println("Player details");
		System.out.println("player name:" + p1.getName() + "\n" + "country name:" + p1.getCountry() + "\n" + "skill:"
				+ p1.getSkill());

	}

}

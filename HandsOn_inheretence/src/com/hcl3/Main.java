package com.hcl3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Stall s = new Stall();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name:");
		s.setName(br.readLine());
		System.out.println("Enter owner name");
		s.setOwnerName(br.readLine());
		System.out.println("Enter stall type:");
		String type = br.readLine();

		System.out.println("Enter size of stall in sq feet:");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Doess the stall have TV?(y/n)");
		String ans = br.readLine();
		if (ans.equals("y")) {
			System.out.println("Enter number of TV");
			int num = Integer.parseInt(br.readLine());
			double d = s.computeCost(type, size, num);
			System.out.println("The cost of the stall is" + d);
		} else {
			double a = s.computeCost(type, size);
			System.out.println("The cost of stall is" + a);
		}

	}

}

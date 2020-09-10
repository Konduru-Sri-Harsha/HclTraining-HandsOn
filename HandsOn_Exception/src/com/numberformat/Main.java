package com.numberformat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ItemType i = new ItemType();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the name");
			String name = br.readLine();
			System.out.println("Enter the deposit:");
			double deposit = Double.parseDouble(br.readLine());
			System.out.println("Enter cost per day:");
			double cost = Double.parseDouble(br.readLine());

			i.setName(name);
			i.setDeposit(deposit);
			i.setCostPerDay(cost);

			i.toString();
		} catch (NumberFormatException ne) {
			System.out.println(ne.toString());
		}

	}

}

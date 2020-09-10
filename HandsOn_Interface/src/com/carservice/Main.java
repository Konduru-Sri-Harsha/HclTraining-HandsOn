package com.carservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Car c = new Service();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ener car number:");
		int num = Integer.parseInt(br.readLine());
		System.out.println("How many years old car do you have-");
		int yrs = Integer.parseInt(br.readLine());
		System.out.println("Enter Car Brand:");
		String brand = br.readLine();
		c.sum(num);
		c.brand(brand);
		c.years(yrs);

	}

}

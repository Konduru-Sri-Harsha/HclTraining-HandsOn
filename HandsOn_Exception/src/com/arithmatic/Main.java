package com.arithmatic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the amount of n days:");
		int days= Integer.parseInt(br.readLine());
		System.out.println("Enter the value of n:");
		int n= Integer.parseInt(br.readLine());
		try {
		double cost = days/n;
		System.out.println("Cost per day of the item is "+cost);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
		}
		
	}

}

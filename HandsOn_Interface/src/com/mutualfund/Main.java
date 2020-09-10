package com.mutualfund;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		MutualFund m= null;
		
		System.out.println("Enter Bank name:");
		String bank= br.readLine();
		if (bank.equals("Axis")) {
		m=new AxisBank();
		m.amount();
		int amount = Integer.parseInt(br.readLine());
		m.duration();
		int yrs = Integer.parseInt(br.readLine());
		double total = amount *(0.56)* yrs;
		System.out.println("Axis Bank \nYou will have returns as "+ total+"/- In 5 years");
		}
		else if(bank.equals("HDFC")) {
		
		m=new HDFC();
		m.amount();
		int amount = Integer.parseInt(br.readLine());
		m.duration();
		int yrs = Integer.parseInt(br.readLine());
		double total = amount *(0.49)* yrs;
		System.out.println("HDFC Bank \nYou will have returns as "+ total+"/- In 5 years");
		}
		
		else if(bank.equals("ICIC")) {
		m=new ICIC();
		m.amount();
		int amount = Integer.parseInt(br.readLine());
		m.duration();
		int yrs = Integer.parseInt(br.readLine());
		double total = amount *(0.60)* yrs;
		System.out.println("ICIC Bank \nYou will have returns as "+ total+"/- In 5 years");
	}

}
}


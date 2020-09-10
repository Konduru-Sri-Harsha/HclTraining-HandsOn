package com.hcl1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int choice;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		SavingsAccount sa = new SavingsAccount();
		CurrentAccount ca = new CurrentAccount();
		System.out.println("Choose type of account:");
		System.out.println("1.Savings account \n2.Current account\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		choice = Integer.parseInt(br.readLine());
		switch (choice) {
		case 1:
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
			String str = br.readLine();
			String[] s = str.split(",", 4);
			sa.setAccName(s[0]);
			sa.setAccNo(s[1]);
			sa.setBankName(s[2]);
			sa.setOrgName(s[3]);
			sa.display();
			break;
		case 2:
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
			String st = br.readLine();
			String[] t = st.split(",", 4);
			ca.setAccName(t[0]);
			ca.setAccNo(t[1]);
			ca.setBankName(t[2]);
			ca.setTinNumber(t[3]);
			ca.display();
			break;
		}

	}
}

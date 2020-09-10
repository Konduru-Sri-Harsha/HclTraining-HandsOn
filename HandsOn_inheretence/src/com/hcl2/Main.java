package com.hcl2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AccountBO a = new AccountBO();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the account details:");
		String str = br.readLine();
		FixedAccount f = a.getAccountDetail(str);
		System.out.format("%-20s %-10s %-20s %-20s %s\n", "Account Number", "Balance", "Account holder name",
				"Minimum balance", "Locking period");
		System.out.format("%-20s %-10s %-20s %-20s %s\n", f.getAccountNumber(), f.getBalance(),
				f.getAccountHolderName(), f.getMinimumBalance(), f.getLockingPeriod());

	}

}

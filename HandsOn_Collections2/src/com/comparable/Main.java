package com.comparable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Address> l = new ArrayList<>();
		System.out.println("Enter number of users");
		int num = Integer.parseInt(br.readLine());
		System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");

		for (int i = 1; i <= num; i++) {

			String str = br.readLine();
			String[] s = str.split(",");
			l.add(new Address(s[0], s[1], s[2], Integer.parseInt(s[3])));

		}
		Collections.sort(l);

		Iterator<Address> it = l.iterator();
		while (it.hasNext()) {

			Address a = it.next();
			System.out.println(a);
		}

	}

}

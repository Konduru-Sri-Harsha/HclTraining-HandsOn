package com.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Address> l = new ArrayList<>();
		LinkedHashMap<String, List<Address>> m1 = new LinkedHashMap<>();
		LinkedHashMap<String, LinkedHashMap<String, List<Address>>> m2 = new LinkedHashMap<>();
		System.out.println("Enter the number of address");
		int num = Integer.parseInt(br.readLine());
		for (int i = 1; i <= num; i++) {

			System.out.println("Enter the address " + i + "details:");
			String str = br.readLine();
			String[] s = str.split(",");
			l.add(new Address(s[0], s[1], s[2], s[3], Integer.parseInt(s[4])));
			m1.put(s[2], l);
			m2.put(s[3], m1);

		}

		System.out.println("Enter the state name to be searched");
		String state = br.readLine();
		if (m2.containsKey(state)) {
			System.out.println("Enter the city to be searched");
			String city = br.readLine();
			if (m1.containsKey(city)) {
				System.out.format("%-15s %-15s %-15s %-15s %s\n","Address 1","Address 2","City","Name","Pincode");
				Iterator<Address> a = m1.get(city).iterator();
				while (a.hasNext()) {

					Address add = a.next();
					if (add.getCity().equals(city)) {

						System.out.println(add);
					}
				}

			} else
				System.out.println("Searched city not found");

		} else
			System.out.println("Searched state not found");

	}

}

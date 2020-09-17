package com.sortlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Hall> l = new ArrayList<>();
		System.out.println("Enter number of halls");
		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {

			System.out.println("Enter hall details " + i);
			String str = br.readLine();
			String[] s = str.split(",");
			l.add(new Hall(s[0], s[1], Double.parseDouble(s[2]), s[3]));

		}

		System.out.println("Sorted Order (from the least expensive to the most):");
		Collections.sort(l);
		Iterator<Hall> i = l.iterator();
		System.out.format("%-15s%-15s%-15s%-15s", "Name", "ContactNumber", "CostPerDay", "OwnerName");
		System.out.println();
		while (i.hasNext()) {

			Hall h = i.next();

			System.out.println(h);
		}
	}

}

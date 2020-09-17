package com.hcl2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List l = new ArrayList<>();

		int i = 1;
		System.out.println("Enter the details of Item Type " + 1);

		do {
			i++;
			System.out.println("Name:");
			String name = br.readLine();
			System.out.println("Deposit:");
			double deposit = Double.parseDouble(br.readLine());
			System.out.println("Cost per day:");
			double cost = Double.parseDouble(br.readLine());
			ItemType it = new ItemType(name, deposit, cost);
			l.add(it);
			System.out.println("Do you want to continue?(y/n)");
			String str = br.readLine();
			if (str.equals("y"))
				System.out.println("Enter the details of Item Type " + i);
			else
				break;

		} while (true);

		Iterator<ItemType> a = l.iterator();
		System.out.println("The entered names are");
		while (a.hasNext()) {

			ItemType item = a.next();
			System.out.println(item);

		}

	}

}

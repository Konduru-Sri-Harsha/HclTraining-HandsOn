package com.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<User> l = new ArrayList<>();

		System.out.println("Enter the number of user details");
		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {

			System.out.println("Enter user " + i + " details");
			String str = br.readLine();
			String[] s = str.split(",");
			l.add(new User(s[0], s[1], s[2], s[3]));

		}

		System.out.println("Search by\n" + "1.Name\n" + "2.Email\n");
		int choice = Integer.parseInt(br.readLine());

		switch (choice) {

		case 1:

			Collections.sort(l);
			System.out.println("Enter name");

			int a = Collections.binarySearch(l, new User(br.readLine(), null, null, null), null);
			if (a < 0)
				System.out.println("Name not found");
			else {
			System.out.format("%-15s %-15s %-15s %s\n", "Name", "Email", "Username", "Password");
			User u1= l.get(a);
			System.out.println(u1);
			}
			break;

		case 2:
			Comparator c = new EmailComparator();
			l.sort(c);
			System.out.println("Enter Email");
			int b = Collections.binarySearch(l, new User(null, br.readLine(), null, null), c);
			if (b < 0)
				System.out.println("Email not found");
			else {
			System.out.format("%-15s %-15s %-15s %s\n", "Name", "Email", "Username", "Password");
			User u2= l.get(b);
			System.out.println(u2);
			}
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}

	}

}

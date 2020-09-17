package com.comparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
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

		System.out.println("Sort by\n" + "1.Name\n" + "2.Email\n");
		int choice = Integer.parseInt(br.readLine());

		switch (choice) {

		case 1:
			Comparator c1 = new NameComparator();
			l.sort(c1);
			Iterator<User> it1 = l.iterator();
			System.out.format("%-15s %-15s %-15s %s\n", "Name", "Email", "Username", "Password");
			while (it1.hasNext()) {

				User u1 = it1.next();
				System.out.println(u1);

			}
			break;

		case 2:
			Comparator c = new EmailComparator();
			l.sort(c);
			Iterator<User> it2 = l.iterator();
			System.out.format("%-15s %-15s %-15s %s\n", "Name", "Email", "Username", "Password");
			while (it2.hasNext()) {

				User u2 = it2.next();
				System.out.println(u2);

			}
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}

	}

}

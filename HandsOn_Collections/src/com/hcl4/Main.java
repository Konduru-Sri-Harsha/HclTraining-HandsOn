package com.hcl4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		UserBO ubo = new UserBO();
		ubo.addAll(ubo.getlist());

		System.out.println("Enter the number of User details to be added");
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {

			System.out.println("Enter the user " + (i + 1) + " detail in csv format");
			String s = br.readLine();
			String[] str = s.split(",");
			ubo.add(new User(str[0], str[1], str[2], str[3]));

		}
		Iterator<User> a = ubo.iterator();
		User user = new User();
		System.out.format("%-20s%-20s%-20s%-20s", "Name", "ContactNumber", "UserName", "Email");
		System.out.println();
		while (a.hasNext()) {

			user = a.next();
			user.display();

		}
		System.out.println("Enter the range to be removed from array list");

		int r1, r2;
		r1 = Integer.parseInt(br.readLine());
		r2 = Integer.parseInt(br.readLine());

		ubo.removeUser(r1, r2);

		Iterator<User> a1 = ubo.iterator();
		User user1 = new User();
		System.out.format("%-20s%-20s%-20s%-20s", "Name", "ContactNumber", "UserName", "Email");
		System.out.println();
		while (a1.hasNext()) {

			user1 = a1.next();
			user1.display();

		}

	}

}

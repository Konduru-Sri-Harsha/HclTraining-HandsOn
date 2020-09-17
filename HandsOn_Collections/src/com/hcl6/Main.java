package com.hcl6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashSet<String> s = new HashSet<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the username");

		while (true) {
			s.add(br.readLine());

			System.out.println("Do you want to continue?(y/n)");
			String str = br.readLine();
			if (str.equals("y")) {

				System.out.println("Enter the username");// Giving null to check set activity

			} else
				break;
		}

		System.out.println("Number of users=" + s.size());
	}

}

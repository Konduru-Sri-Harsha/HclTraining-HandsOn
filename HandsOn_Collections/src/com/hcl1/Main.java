package com.hcl1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = 1;
		System.out.println("Enter the username" + i);
		do {

			al.add(br.readLine());

			System.out.println("Do you want to continue?(y/n)");
			String str = br.readLine();
			if (str.equals("y")) {
				i++;
				System.out.println("Enter the username" + i);

			} else
				break;
		} while (true);

		Iterator<String> a = al.iterator();
		System.out.println("The entered names are");
		while (a.hasNext()) {

			System.out.println(a.next());

		}

	}

}

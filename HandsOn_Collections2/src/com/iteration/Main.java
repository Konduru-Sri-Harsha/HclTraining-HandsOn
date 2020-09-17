package com.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Stall> l = new ArrayList<>();
		System.out.println("Enter number of stalls");
		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {

			System.out.println("Enter stall " + i + " details");
			String str = br.readLine();
			String[] s = str.split(",");
			l.add(new Stall(s[0], s[1], s[2], s[3]));

		}

		System.out.format("%-15s %-20s %-15s %s", "Name", "Details", "Type", "OwnerName");
		System.out.println();
		Iterator<Stall> it = l.iterator();

		while (it.hasNext()) {
			Stall s = it.next();

			if (s.getName().startsWith("test"))
				it.remove();
			else
				System.out.println(s);

		}

	}

}

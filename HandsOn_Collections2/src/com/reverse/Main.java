package com.reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<User> l = new ArrayList<>();
		LinkedHashMap<String, String> m = new LinkedHashMap<>();

		System.out.println("Enter the number of users:");
		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {

			System.out.println("Enter the details of user " + i);
			String str = br.readLine();
			String[] s = str.split(",");
			l.add(new User(s[0], s[1], s[2], s[3]));

		}
		Collections.sort(l);
		Collections.reverse(l);

		System.out.format("%-15s%-15s", "Name", "MobileNumber");
		System.out.println();

		for (int a = 0; a < num; a++) {
			m.put(l.get(a).getName(), l.get(a).getMobileNumber());

		}
		Set s = m.entrySet();
		Iterator<LinkedHashMap> i = s.iterator();
		while (i.hasNext()) {

			Map.Entry h = (Map.Entry) i.next();

			System.out.format("%-15s%-15s", h.getKey(), h.getValue());
			System.out.println();
		}

	}

}

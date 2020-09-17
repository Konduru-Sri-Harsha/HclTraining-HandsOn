package com.minmax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<TicketBooking> l = new ArrayList<>();
		System.out.println("Enter number of customers");
		int num = Integer.parseInt(br.readLine());
		if (num > 0) {
			System.out.println("Enter the booking price accordingly with customer name in CSV(Customer Name,Price)");
			for (int i = 0; i < num; i++) {

				String str = br.readLine();
				String s[] = str.split(",");
				String name = s[0];
				int price = Integer.parseInt(s[1]);
				l.add(new TicketBooking(name, price));

			}

			Comparator comp = new TicketBooking();
			TicketBooking t1 = Collections.min(l, comp);
			System.out.println(t1.getCustomerName() + " spends minimum amount of " + t1.getPrice());
			TicketBooking t2 = Collections.max(l, comp);
			System.out.println(t2.getCustomerName() + " spends maximum amount of " + t2.getPrice());
		} else
			System.out.println("Invalid input");
	}

}

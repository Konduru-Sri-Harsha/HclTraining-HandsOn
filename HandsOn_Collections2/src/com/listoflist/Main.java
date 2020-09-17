package com.listoflist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<List<Integer>> daylist = new ArrayList<>();

		List<Integer> showlist = new ArrayList<>();

		System.out.println("Enter the count of tickets booked");

		for (int i = 1; i <= 5; i++) {

			System.out.println("On Day " + i);
			String str = br.readLine();
			String[] s = str.split(",");
			showlist.add(100-Integer.parseInt(s[0]));
			showlist.add(100-Integer.parseInt(s[1]));
			showlist.add(100-Integer.parseInt(s[2]));
			showlist.add(100-Integer.parseInt(s[3]));

		}
		int a = 0;
		for (int j = 0; j < 5; j++) {

			daylist.add(showlist.subList(a, a + 4));
			a = a + 4;
		}
		do {
		System.out.println("Enter the day to know its remaining ticket count:");
		int num = Integer.parseInt(br.readLine());
		
		System.out.println("Remaining Tickets:"+daylist.get(num-1));
		
		
		System.out.println("Do you want to continue?(y/n)");
		String opt= br.readLine();
		if(opt.equals("n"))
			break;
		
		}while(true);
	}

}

package com.hcl3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> l = new ArrayList<>();

		System.out.println("Enter number of halls:");
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {

			System.out.println("Enter hall name " + (i + 1));
			l.add(br.readLine());

		}
		System.out.println("Enter the hallname to be searched:");
		String str = br.readLine();

		if (l.contains(str))
			System.out.println(str + " found at " + l.indexOf(str));
		else
			System.out.println(str+" not found");

	}

}

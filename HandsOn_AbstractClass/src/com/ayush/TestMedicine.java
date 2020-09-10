package com.ayush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		TestMedicine main = new TestMedicine();
		Medicine[] med = main.getDetails();
		for (int i = 0; i < 5; i++) {
			System.out.println();
			med[i].getDetails();
			med[i].displayLable();
		}

	}

	public Medicine[] getDetails() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 5 medicine details:");
		Medicine option;
		Medicine[] m = new Medicine[5];
		for (int i = 0; i < 5; i++) {
			int num = new Random().nextInt(3);
			if (num == 0) {
				System.out.println("Enter Tablet Details :");
				String t = br.readLine();
				String[] st = t.split(",");
				option = new Tablet(st[0], Double.parseDouble(st[1]), st[2]);
				m[i] = option;
			} else if (num == 1) {

				System.out.println("Enter Ointment details:");
				String o = br.readLine();
				String[] so = o.split(",");
				option = new Ointment(so[0], Double.parseDouble(so[1]), so[2]);
				m[i] = option;
			} else if (num == 2) {

				System.out.println("Enter the Syrup details:");
				String s = br.readLine();
				String[] ss = s.split(",");
				option = new Syrup(ss[0], Double.parseDouble(ss[1]), ss[2]);
				m[i] = option;
			}

		}
		return m;

	}
}

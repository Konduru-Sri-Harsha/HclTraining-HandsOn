package com.hcl5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int divisor;
	static int[] i = new int[10];

	class WrongComboException extends RuntimeException {
		WrongComboException(String description) {
			super(description);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter any 10 values:");
		Main m = new Main();
		for (int x = 0; x < 10; x++) {
			i[x] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter divisor");
		divisor = Integer.parseInt(br.readLine());
		m.divide();
	}

	void divide() {
		for (int y = 0; y < 10; y++) {
			try {
				if ((i[y] % divisor) != 0)
					throw new WrongComboException("e");
				System.out.println("valid combo");
			} catch (WrongComboException wc) {
				System.out.println("invalid combo: " + i[y] + " " + divisor);
			}
		}

	}

}

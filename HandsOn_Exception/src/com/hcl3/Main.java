package com.hcl3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] i = new int[10];
	static int divisor, y, div;

	class IllegalArgumentException extends RuntimeException {

		IllegalArgumentException(String description) {
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

	public void divide() {
		for (y = 0; y < 10; y++) {
			try {
				if ((i[y] % 2 == 0) && (divisor % 2 == 1))
					throw new IllegalArgumentException("odd and even");
				if ((i[y] % 2 == 1) && (divisor % 2 == 0))
					throw new IllegalArgumentException("odd and even");
				div = i[y] / divisor;
				System.out.println("Result:" + div + "\n");

			} catch (IllegalArgumentException ie) {
				System.out.println("Exception handled in the method");
				div = i[y] / divisor;
				System.out.println("Result:" + div + "\n");

			}
		}

	}

}

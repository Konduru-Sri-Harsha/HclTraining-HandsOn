package com.inputmismatch;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 
		try {
			System.out.println("Enter integer input:");
			int i= s.nextInt();
			System.out.println("Entered value is:"+i);
		}catch(InputMismatchException im) {
			System.out.println(im.getClass());
		}
	}

}

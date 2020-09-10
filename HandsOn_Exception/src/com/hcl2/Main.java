package com.hcl2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

		static int  []i= new int[10];
		static int divisor;
		public static void main(String[] args) throws NumberFormatException, IOException {
			// TODO Auto-generated method stub
			
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter any 10 values:");
			
			for(int x=0; x<10;x++) {
				i[x]=Integer.parseInt(br.readLine());
			}
			System.out.println("Enter divisor");
			divisor = Integer.parseInt(br.readLine());
			try {
			for(int y=0;y<10;y++) {
				
				int r= i[y]/divisor;
				System.out.println("Result:"+r);
				}
			}
				catch (ArithmeticException ae) {
					System.out.println("Can not divide by zero");
				}
	
			
		}
}
		



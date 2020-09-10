package com.hcl1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int  []i= new int[10];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Main m= new Main();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any 10 values:");
		
		for(int x=0; x<10;x++) {
			i[x]=Integer.parseInt(br.readLine());
		}
		try {
		m.divide();
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Elments Over");
		}
	}
	public void divide() {
		
		for(int y=0;y<100;y++) {
			
			int r= i[y]/(10-y);
			System.out.println("Result:"+r);
			
		}
	}
}

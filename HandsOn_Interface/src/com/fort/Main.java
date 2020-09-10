package com.fort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What you want to visit\n" +"Rajmachi\n" +"Shivgadh\n" +"Murud\n");
		String s = br.readLine();
		if (s.equals("Rajmachi")) {
			Fort f= new Rajmachi();
			f.display();
		}
		else if(s.equals("Shivgadh")) {
			Fort f= new Shivgadh();
			f.display();
		}
		else if(s.equals("Murud")) {
			Fort f= new Murud();
			f.display();
		}
		
	}

}

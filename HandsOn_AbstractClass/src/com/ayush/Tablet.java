package com.ayush;

public class Tablet extends Medicine {
	
	public Tablet(String name, double price, String expDate) {
		super(name, price, expDate);
	}

	
	public void displayLable() {
		
		System.out.println("Store in cool place");
	}
}

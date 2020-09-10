package com.ayush;

public class Syrup extends Medicine {
	
	public  Syrup(String name, double price, String expDate) {
		super(name, price, expDate);
	}

	public void displayLable() {
		
		System.out.println("Take physician’s advice\r\n" + "Dosage :\n" + "Adult :2spoons twice a day\n" + "Children : 1spoon twice a day");
		
	}
	
}

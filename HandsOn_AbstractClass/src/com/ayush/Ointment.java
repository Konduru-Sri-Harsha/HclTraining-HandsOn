package com.ayush;

public class Ointment extends Medicine {
		

		public Ointment(String name, double price, String expDate) {
			super(name, price, expDate);
		}


		@Override
		public void displayLable() {
			System.out.println("For external use only.");
			
		}

}

package com.ayush;


public abstract class Medicine {
	public String name;
	public double price;
	public String expiry_Date;

	public Medicine() {
		
	}

	public Medicine(String name, double price, String expiry_Date) {
		super();
		this.name = name;
		this.price = price;
		this.expiry_Date = expiry_Date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getExpiry_Date() {
		return expiry_Date;
	}

	public void setExpiry_Date(String expiry_Date) {
		this.expiry_Date = expiry_Date;
	}
	public void getDetails(){
		System.out.println("Medicine details:");
		System.out.println("Medicine name:" + name);
		System.out.println("Price:" + price);
		System.out.println("Expiry date:" + expiry_Date);
		
	}
	public abstract void displayLable();
}

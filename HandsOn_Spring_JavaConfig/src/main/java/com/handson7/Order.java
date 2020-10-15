package com.handson7;

import org.springframework.stereotype.Component;

@Component
public class Order {
	private String itemName;
	private double price;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

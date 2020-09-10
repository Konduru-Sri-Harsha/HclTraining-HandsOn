package com.hcl3;

public class Stall {
	protected String name;
	protected String detail;
	protected String ownerName;

	public Stall() {

	}

	public Stall(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Double computeCost(String stallType, Integer squareFeet) {
		double price = 0;
		if (stallType.equals("Platinum")) {
			price = squareFeet * 200;
		} else if (stallType.equals("Diamond")) {
			price = squareFeet * 150;
		} else if (stallType.equals("Gold")) {
			price = squareFeet * 100;
		} else {
			System.out.println("Enter valid stall");
		}
		return price;
	}

	public Double computeCost(String stallType, Integer squareFeet, Integer numberOfTV) {
		double price = 0;
		double total = 0;
		if (stallType.equals("Platinum")) {
			price = squareFeet * 200;
		} else if (stallType.equals("Diamond")) {
			price = squareFeet * 150;
		} else if (stallType.equals("Gold")) {
			price = squareFeet * 100;
		} else {
			System.out.println("Enter valid stall");
		}
		total = price + (numberOfTV * 10000);

		return total;
	}

}

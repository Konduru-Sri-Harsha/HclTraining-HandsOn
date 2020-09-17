package com.hcl2;

public class ItemType {

	private String name;
	private double deposit;
	private double costPerDay;

	public ItemType() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public ItemType(String name, double deposit, double costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	@Override
	public String toString() {

		System.out.format("%-20s %-20s %-20s", "Name", "Deposit", "CostPerDay");
		System.out.println("");
		System.out.format("%-20s %-20s %-20s", name, deposit, costPerDay);
		return "";

	}

}

package com.sortlist;

import java.util.Comparator;

public class Hall implements Comparable {

	private String name;
	private String contactNumber;
	private double costPerDay;
	private String ownerName;

	public Hall() {

	}

	public Hall(String name, String contactNumber, double costPerDay, String ownerName) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		System.out.format("%-15s%-15s%-15s%-15s", name, contactNumber, costPerDay, ownerName);
		System.out.println();
		return "";
	}

	@Override
	public int compareTo(Object a) {

		Hall h1 = (Hall) a;

		if (h1.getCostPerDay() < costPerDay)
			return 1;

		else if (h1.getCostPerDay() > costPerDay)
			return -1;

		else
			return 0;

	}

}

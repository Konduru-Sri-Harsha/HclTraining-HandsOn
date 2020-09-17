package com.iteration;

public class Stall {

	private String name;
	private String details;
	private String type;
	private String ownerName;

	public Stall() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Stall(String name, String details, String type, String ownerName) {
		super();
		this.name = name;
		this.details = details;
		this.type = type;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		System.out.format("%-15s %-20s %-15s %s", name, details, type, ownerName);
		System.out.println();
		return "";
	}

}

package com.hcl1;

public class ExecutiveStall implements Stall {
	private String stallName;
	private String ownerName;
	private int cost;
	private String screen;

	public ExecutiveStall() {

	}

	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public ExecutiveStall(String stallName, String ownerName, int cost, String screen) {
		super();
		this.stallName = stallName;
		this.ownerName = ownerName;
		this.cost = cost;
		this.screen = screen;
	}

	@Override
	public void display() {
		System.out.println("Stall Name:" + stallName);
		System.out.println("Cost:" + cost + ".rs");
		System.out.println("Owner Name:" + ownerName);
		System.out.println("Number of screens:" + screen);

	}
}

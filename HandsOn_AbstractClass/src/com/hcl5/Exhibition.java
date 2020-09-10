package com.hcl5;

public class Exhibition extends Event {
	private int noOfStall;
	
	public Exhibition()
	{
		
	}

	public int getNoOfStall() {
		return noOfStall;
	}

	public void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}

	public Exhibition(String name, String detail, String ownerName, int noOfStall) {
		super(name, detail, ownerName);
		this.noOfStall = noOfStall;
	}
	
	public Double projectedRevenue(int num) {
		double d=0.0;
		d= num*10000;
		return d;
	}
	
}

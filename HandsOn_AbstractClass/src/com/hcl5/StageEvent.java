package com.hcl5;

public class StageEvent extends Event {
	private int noOfShows;
	private int noOfSeatsPerShow;
	public int getNoOfShows() {
		return noOfShows;
	}
	
	public StageEvent() 
	{
		
	}
	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}
	public int getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}
	public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	public StageEvent(String name, String detail, String ownerName, int noOfShows, int noOfSeatsPerShow) {
		super(name, detail, ownerName);
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	
	public Double projectedRevenue() {
		double d=0.0;
		return d;
	}
	
	public Double projectedRevenue(int shows,int num) {
		double d=0.0;
		d= num*shows*50;
		return d;
	}
	
	
}

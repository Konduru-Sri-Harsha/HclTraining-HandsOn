package com.hcl5;

public class Event {
	protected String name;
	protected String detail;
	protected String ownerName;
	public String getName() {
		return name;
	}
	
	public Event() 
	{
		
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
	public Event(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}
	
	public Double projectedRevenue() {
		double d=0.0;
		return d;
	}
	
}

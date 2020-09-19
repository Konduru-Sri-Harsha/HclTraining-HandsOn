package com.hcl7;

public class CallLog implements Comparable {
	private String name;
	private String dialledNumber;
	private String duration;
	private String dialledDate;

	public CallLog() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDialledNumber() {
		return dialledNumber;
	}

	public void setDialledNumber(String dialledNumber) {
		this.dialledNumber = dialledNumber;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDialledDate() {
		return dialledDate;
	}

	public void setDialledDate(String dialledDate) {
		this.dialledDate = dialledDate;
	}

	public CallLog(String name, String dialledNumber, String duration, String dialledDate) {
		super();
		this.name = name;
		this.dialledNumber = dialledNumber;
		this.duration = duration;
		this.dialledDate = dialledDate;
	}

	@Override
	public int compareTo(Object a) {
		CallLog c = (CallLog) a;

		return (c.getName().compareTo(name));

	}

	@Override
	public String toString() {
		
		System.out.format("%-25s%-10s",name+"(+91-"+dialledNumber+")",duration+"seconds");
		System.out.println();
		
		return "";
	}

	
	
	
}

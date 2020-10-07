package com.hcl4.model;

public class Employee {
	private int eno;
	private String name;
	private String address;

	 
	 public Employee() {
	}


	@Override
	public String toString() {
		return eno+"\t"+name+"\t"+address;
	}


	public Employee(int eno, String name, String address) {
		super();
		this.eno = eno;
		this.name = name;
		this.address = address;
	}


	public int getEno() {
		return eno;
	}


	public void setEno(int eno) {
		this.eno = eno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	
}

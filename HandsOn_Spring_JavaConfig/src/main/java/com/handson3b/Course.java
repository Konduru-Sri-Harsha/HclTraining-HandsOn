package com.handson3b;

import org.springframework.stereotype.Component;

@Component
public class Course {
	private String name;
	private String mentor;
	private Double fee;
	
	public Course() {
		
	}

	public Course(String name, String mentor, Double fee) {
		super();
		this.name = name;
		this.mentor = mentor;
		this.fee = fee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}
	
	public void display() {
		System.out.println(name+"\t"+mentor+"\t"+fee);
	}
}

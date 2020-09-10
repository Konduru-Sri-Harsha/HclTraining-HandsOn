package com.hcl3;

public class Delivery {
	public Long over;
	public Long ball;
	public Long runs;
	public String batsman;
	public String bowler;
	public String nonStriker;

	public Delivery() {

	}

	public Delivery(Long over, Long ball, Long runs, String batsman, String bowler, String nonStriker) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}

	void displayDeliveryDetails() {
		System.out.println("Delivery Details");
		System.out.println("Over:" + over);
		System.out.println("Ball:" + ball);
		System.out.println("Runs:" + runs);
		System.out.println("Batsman:" + batsman);
		System.out.println("Bowler:" + bowler);
		System.out.println("NonStriker:" + nonStriker);

	}
}
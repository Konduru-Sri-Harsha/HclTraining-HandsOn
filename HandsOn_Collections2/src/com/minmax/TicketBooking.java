package com.minmax;

import java.util.Comparator;

public class TicketBooking implements Comparator {

	private String customerName;
	private int price;

	public TicketBooking() {

	}

	public TicketBooking(String customerName, int price) {
		super();
		this.customerName = customerName;
		this.price = price;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compare(Object a, Object b) {

		TicketBooking t1 = (TicketBooking) a;
		TicketBooking t2 = (TicketBooking) b;

		if (t1.price < t2.price)
			return -1;

		else if (t1.price > t2.price)
			return 1;
		else
			return 0;

	}

}

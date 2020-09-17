package com.comparable;

public class Address implements Comparable {

	private String userName;
	private String addressLine1;
	private String addressLine2;
	private int pincode;

	public Address() {

	}

	public Address(String userName, String addressLine1, String addressLine2, int pincode) {
		super();
		this.userName = userName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pincode = pincode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public int compareTo(Object a) {

		Address ad = (Address) a;

		if (ad.getPincode() < pincode)
			return 1;
		else if (ad.getPincode() > pincode)
			return -1;
		else if (ad.getPincode() == pincode)
			ad.getAddressLine1().compareTo(addressLine1);
		return 0;
	}

	@Override
	public String toString() {

		return userName + "," + addressLine1 + "," + addressLine2 + "," + pincode;
	}

}

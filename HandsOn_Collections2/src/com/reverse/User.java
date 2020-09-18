package com.reverse;

public class User implements Comparable {

	private String name;
	private String mobileNumber;
	private String username;
	private String password;

	public User() {

	}

	public User(String name, String mobileNumber, String username, String password) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		System.out.format("%-15s%-15s", name, mobileNumber);
		System.out.println();
		return "";
	}

	@Override
	public int compareTo(Object a) {

		User u = (User) a;

		return name.compareTo(u.getName());

	}

}

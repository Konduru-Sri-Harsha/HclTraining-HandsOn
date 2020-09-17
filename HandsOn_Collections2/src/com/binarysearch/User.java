package com.binarysearch;

public class User implements Comparable {

	private String name;
	private String email;
	private String username;
	private String password;

	public User() {

	}

	public User(String name, String email, String username, String password) {
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		System.out.format("%-15s %-15s %-15s %s\n", name, email, username, password);
		return "";
	}

	@Override
	public int compareTo(Object o) {
		User u = (User) o;
		return u.getName().compareTo(name);
	}

}

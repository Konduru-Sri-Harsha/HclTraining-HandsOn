package com.hcl1;

public class SavingsAccount extends Account {
	private String orgName;

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public SavingsAccount() {

	}

	public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
		super(accName, accNo, bankName);
		this.orgName = orgName;
	}

	public void display() {
		super.display();
		System.out.println("Organisation name:" + orgName);
	}

}

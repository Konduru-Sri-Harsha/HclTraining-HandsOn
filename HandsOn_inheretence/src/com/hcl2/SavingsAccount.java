package com.hcl2;

public class SavingsAccount extends Account {
	protected double minimumBalance;

	public SavingsAccount() {

	}

	public SavingsAccount(String accountNumber, double balance, String accountHolderName, double minimumBalance) {
		super(accountNumber, balance, accountHolderName);
		this.minimumBalance = minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

}

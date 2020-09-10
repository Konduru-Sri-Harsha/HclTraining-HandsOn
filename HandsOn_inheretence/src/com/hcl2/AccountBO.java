package com.hcl2;

public class AccountBO {
	public FixedAccount getAccountDetail(String details) {

		FixedAccount fa = new FixedAccount();
		String s[] = details.split(",", 5);
		fa.setAccountHolderName(s[0]);
		fa.setBalance(Double.parseDouble(s[1]));
		fa.setAccountNumber(s[2]);
		fa.setMinimumBalance(Double.parseDouble(s[3]));
		fa.setLockingPeriod(Integer.parseInt(s[4]));
		return fa;
	}

}

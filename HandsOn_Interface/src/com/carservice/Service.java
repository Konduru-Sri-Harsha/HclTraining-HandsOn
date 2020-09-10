package com.carservice;

public class Service implements Car {

	@Override
	public void sum(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		if (sum % 2 == 0)
			System.out.println("You can come on Tuesday, Thursday or Saturday");
		else
			System.out.println("You can come on Monday, Wednesday or Friday");

	}

	@Override
	public void years(int yrs) {
		if (yrs > 5)
			System.out.println("Car wash is free for you");
		else
			System.out.println("Your car is not eligible for free wash");

	}

	@Override
	public void brand(String name) {
		if (name.equals("Maruthi"))
			System.out.println("Your servicing charges are- 4750");
		else
			System.out.println("Your servicing charges are- 5000");
	}

}

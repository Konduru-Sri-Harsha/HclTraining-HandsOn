package com.hcl4;

import java.util.ArrayList;

public class UserBO extends ArrayList<User> {

	static UserBO u = new UserBO();

	void removeUser(int n1, int n2) {

		removeRange(n1, n2);

	}

	static UserBO getlist() {
		
		u.add(new User("mohan Raja", "9874563210", "mohan", "mohan@abc.in"));
		u.add(new User("arjun Ravi", "4324237", "arjun", "arjun@abc.in"));
		u.add(new User("Arun kumar", "9845671230", "arun", "arun@abc.in"));

		return u;

	}

}

package com.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		User u1 = (User) o1;
		User u2 = (User) o2;

		return u1.getName().compareTo(u2.getName());
	}

}

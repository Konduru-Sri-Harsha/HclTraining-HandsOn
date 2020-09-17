package com.binarysearch;

import java.util.Comparator;

public class EmailComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		User u1 = (User) o1;
		User u2 = (User) o2;

		return u1.getEmail().compareTo(u2.getEmail());
	}

}

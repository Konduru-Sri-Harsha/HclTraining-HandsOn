package com.hcl7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new FileReader(
				"C:\\Users\\kondu\\Desktop\\HCL\\java\\HandsOn_Collections\\src\\com\\hcl7\\CallLog.csv"));
		List<CallLog> l = new ArrayList<>();
		String line;
		while ((line = bf.readLine()) != null) {
			String[] s = line.split(",");
			l.add(new CallLog(s[0], s[1], s[2], s[3]));

		}
		Collections.sort(l);
	
		System.out.format("%-25s%-10s", "Caller Name", "Duration");
		System.out.println();
		Iterator<CallLog> it = l.iterator();

		while (it.hasNext()) {

			CallLog c = it.next();
			System.out.println(c);

		}

	}

}

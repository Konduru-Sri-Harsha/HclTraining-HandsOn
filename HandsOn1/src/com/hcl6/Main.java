package com.hcl6;

import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;
import javax.xml.bind.helpers.ParseConversionEventImpl;

import org.omg.CORBA.portable.ValueOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtraType et = new ExtraType();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter extra type details");
		String str = s.nextLine();
		String[] details = str.split("#", 2);

		Long i = Long.parseLong(details[1]);

		et.setName(details[0]);
		et.setRuns(i);

		System.out.println("ExtraType Details");
		System.out.println("Extra Type:" + et.getName() + "\n" + "Runs:" + et.getRuns());

	}

}

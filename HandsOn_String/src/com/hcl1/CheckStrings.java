package com.hcl1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckStrings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		CheckStrings c = new CheckStrings();

		// 1
		System.out.println("Enter Humpty's Sentence:");
		String s11 = br.readLine();
		System.out.println("Enter Dumpty's sentence:");
		String s12 = br.readLine();
		System.out.println("Cocantenated String: " + c.concactString(s11, s12) + "\n");

		// 2
		System.out.println("Enter Humpty's Sentence:");
		String s21 = br.readLine();
		System.out.println("Enter Dumpty's word to search:");
		String s22 = br.readLine();
		if (c.contains(s21, s22))
			System.out.println("Found" + "\n");
		else
			System.out.println("Not found" + "\n");

		// 3
		System.out.println("Enter Humpty's Sentence:");
		String s3 = br.readLine();
		System.out.println("Dumpty Says: " + c.stringRev(s3) + "\n");

		// 4
		System.out.println("Enter Humpty's Sentence:");
		String s41 = br.readLine();
		System.out.println("Word To Replace:");
		String s42 = br.readLine();
		System.out.println("Synonym:");
		String s43 = br.readLine();
		System.out.println("Replaced String: " + c.stringReplace(s41, s42, s43) + "\n");
		
		//5
		System.out.println("Enter Humpty's Sentence:");
		String s51 = br.readLine();
		System.out.println("Enter Dumpty's sentence:");
		String s52 = br.readLine();
		boolean b = c.locationEquals(s51, s52);
		if(b== true)
			System.out.println("It's a echo");
		else
			System.out.println("Dumpty is repeating");

		// 6
		System.out.println("Enter line:");
		String s61 = br.readLine();
		System.out.println("Dumpty say: " + s61);
		System.out.println("What Humpty Want To Remove?");
		String s62 = br.readLine();
		System.out.println("Dumpty's New Sentense: " + c.editString(s61, s62) + "\n");

		// 7
		System.out.println("Enter humpty's sentence:");
		String s71 = br.readLine();
		System.out.println("Humpty says:" + s71);
		System.out.println("dumpty wants to insert what and where:");
		String s72 = br.readLine();
		System.out.println("Enter position:");
		int pos = Integer.parseInt(br.readLine());
		System.out.println("new sentence is: " + c.insertData(s71, s72, pos) + "\n");

		// 8
		System.out.println("Enter Humpty's sentence:");
		String s81 = br.readLine();
		System.out.println("Enter dumpty's sentence:");
		String s82 = br.readLine();
		int i = c.checkWords(s81, s82);
		if (i == 0)
			System.out.println("Both have used equal number of words" + "\n");
		else if (i == 1)
			System.out.println("Humpty has used more words" + "\n");
		else if (i == 2)
			System.out.println("Dumpty has used more words" + "\n");

		// 9
		System.out.println("Enter Humpty's sentence:");
		String s9 = br.readLine();
		System.out.println("Converted string: " + c.covertString(s9) + "\n");

		// 10
		System.out.println("Enter Humpty's sentence:");
		String s10 = br.readLine();
		c.checkUpperCase(s10);

	}

	public String concactString(String s1, String s2) {

		String s = s1 + "." + s2;

		return s;

	}

	public boolean contains(String s1, String s2) {

		boolean c = s1.contains(s2);

		return c;
	}

	public String stringRev(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();

		return sb.toString();

	}

	public String stringReplace(String s, String a, String b) {

		String str = s.replaceAll(a, b);
		return str;
	}

	public boolean locationEquals(String a, String b) {

		boolean c = false;
		if (a == b)
			c = true;
		else
			c = false;

		return c;

	}

	public String editString(String s1, String s2) {

		String s = s1.replaceAll(s2, "");

		return s;

	}

	public String insertData(String s1, String s2, int pos) {

		StringBuilder sb = new StringBuilder(s1);
		sb.insert(pos - 1, s2);
		String s = sb.toString();
		return s;

	}

	public int checkWords(String s1, String s2) {

		int wordCount1 = 0;
		int wordCount2 = 0;
		int r = 0;
		if (s1 == null || s1.equals(""))
			return wordCount1;

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == ' ') {

				wordCount1++;

			} else {
				if (i == s1.length() - 1)
					wordCount1++;

			}

		}
		if (s2 == null || s2.equals(""))
			return wordCount2;

		for (int i = 0; i < s2.length(); i++) {

			if (s2.charAt(i) == ' ') {

				wordCount2++;

			} else {
				if (i == s2.length() - 1)
					wordCount2++;

			}

		}

		if (wordCount1 > wordCount2)
			r = 1;
		else if (wordCount1 < wordCount2)
			r = 2;
		else if (wordCount1 == wordCount2)
			r = 0;
		return r;
	}

	public String covertString(String s1) {

		int c = s1.charAt(0);
		String s2 = null;

		if (c >= 97 && c <= 122)
			s2 = s1.toUpperCase();
		else if (c >= 65 && c <= 90)
			s2 = s1.toLowerCase();
		return s2;
	}

	public void checkUpperCase(String s1) {

		String s = s1.toUpperCase();
		if (s1.equals(s))
			System.out.println("String is in uppercase");

		else

			System.out.println("String is not in uppercase");
	}

}

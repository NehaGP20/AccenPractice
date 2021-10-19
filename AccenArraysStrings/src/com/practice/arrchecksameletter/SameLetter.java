package com.practice.arrchecksameletter;

import java.util.*;

public class SameLetter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		String[] ch1 = str1.split("");
		String[] ch2 = str1.split("");

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}

	}

}

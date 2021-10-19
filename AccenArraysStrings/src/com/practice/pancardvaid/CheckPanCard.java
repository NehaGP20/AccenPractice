package com.practice.pancardvaid;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPanCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PAN no:");
		String pan = sc.next();
		if (pan.length() == 10) {
			String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";

			// Compile the pattern
			Pattern p = Pattern.compile(regex);
			// pattern should match with the string
			Matcher m = p.matcher(pan);
			boolean check = m.matches();

			if (check) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		} else {
			System.out.println("Invalid");
		}
	}

}

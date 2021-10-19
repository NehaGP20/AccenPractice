package com.practice.displaydate;

import java.util.*;

public class DisplayDate {

	public static String findDate(int date) {
		String[] suffix = { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
		int num = date % 100;
		return String.valueOf(date) + suffix[(num > 3 && num < 21) ? 0 : num % 10];
		// num%10 => remainder of date is extracted
	}

	public static String findMonth(int month) {
		String[] fixMonth = { "January", "Febrauary", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		return fixMonth[month - 1];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 integers for the day of the month, month and year: ");
		int date = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();

		String stuff = findDate(date);
		String mon = findMonth(month);
		System.out.println(stuff + "" + mon + "" + year);
	}

}

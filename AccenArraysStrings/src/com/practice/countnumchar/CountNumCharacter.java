package com.practice.countnumchar;

import java.util.*;

public class CountNumCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String str = sc.nextLine();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				if (!(ch == ' ')) {
					count++;
				}
			} else {
				System.out.println("Invalid input");
				System.exit(0);
			}
		}

		System.out.println(str + " has " + count + " characters");

	}

}

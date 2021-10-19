package com.practice.uniquechar;

import java.util.*;

public class UniqueCharacter {

	static final int NO_OF_CHARS = 256; // Count of character

	public static void printDistinct(String str) {
		boolean res = str.matches("[a-z A-Z]+");
		if (!res) {
			System.out.println("Invalid Sentence");
			System.exit(0);
		}

		int[] count = new int[NO_OF_CHARS];
		int i;
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count[(int) str.charAt(i)]++;
		}

		int n = i; //Storing that unique character to n => So total 8 unique characters
		int p = 0;

		for (i = 0; i < n; i++) {
			if (count[str.charAt(i)] == 1) {
				p++;
			}
		}

		if (p > 0) {
			System.out.println("Unique characters:");

			for (i = 0; i < n; i++) {
				if (count[str.charAt(i)] == 1) {
					System.out.println(str.charAt(i));
				}
			}
		} else {
			System.out.println("No unique characters");
		}
	}

	public static void main(String[] args) {
		String str = "java is an object oriented programming language";
		printDistinct(str);
	}

}

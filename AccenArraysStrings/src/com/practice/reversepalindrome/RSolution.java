package com.practice.reversepalindrome;

import java.util.Arrays;
import java.util.Scanner;

public class RSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.split(" ");
		String[] rev = Arrays.copyOf(words, words.length);

		for (int i = 0; i < rev.length; i++) {
			StringBuffer buf = new StringBuffer(rev[i]);
			buf.reverse();
			rev[i] = buf.toString();
		}

		boolean flag = false;
		for (int i = 0; i < rev.length; i++) {
			words[i] = words[i].toLowerCase();
			rev[i] = rev[i].toLowerCase();
			if (rev[i].equals(words[i]) && words[i].length() > 1) {
				System.out.println(rev[i]);
				flag = true;
			}
		}

		if (!flag) {
			System.out.println("No Palindrome");
		}
	}

}

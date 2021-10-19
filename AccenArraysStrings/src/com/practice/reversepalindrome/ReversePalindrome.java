package com.practice.reversepalindrome;

import java.util.*;

public class ReversePalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.split(" ");
		String[] temp = new String[words.length];
		boolean flag = false;

		for (int i = 0; i < words.length; i++) {
			String lol = words[i];
			String rev = "";
			for (int j = lol.length() - 1; j >= 0; j--) {
				rev += lol.charAt(j);
			}
			temp[i] = rev;

		}

		for (int k = 0; k < words.length; k++) {
			if (words[k].equals(temp[k])) {
				System.out.println(temp[k]);
				flag = true;
			}
		}

		if (!flag) {
			System.out.println("No Palindrome");
		}

	}

}

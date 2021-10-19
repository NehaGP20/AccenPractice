package com.practice.substitutioncipher;

import java.util.*;
import java.lang.*;

public class UnderstoodSolution {

	public static StringBuilder decrypted(String text, int key) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);

			if (ch == ' ') {
				result.append(" ");
			} else if ((ch <= 0 && ch >= 64) || (ch <= 91 && ch >= 96) || (ch <= 123 && ch >= 127)) {
				result.append("");
			} else if (Character.isUpperCase(ch)) {
				
				// Since this is decryption we need to make sure that character do not exceed a
				// so we would add 'a'
				// Inside bracket we need to move backwards so we would subtract ch with key
				// along with that making sure that it falls within range add 26. but point here
				// is key is small so subtract that first with 'a'
				// In later stages we can mod 26
				char c = (char) ('A' + (ch - 'A' - key + 26) % 26);
				result.append(c);
			}else {
				char c = (char) ('a' + (ch - 'a' - key + 26) % 26);
				result.append(c);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int key = 7;
		System.out.println("Enter encrypted text: ");
		String text = sc.nextLine();
		System.out.println(decrypted(text, key));
	}

}

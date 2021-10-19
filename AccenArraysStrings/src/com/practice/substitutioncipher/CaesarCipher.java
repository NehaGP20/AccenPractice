package com.practice.substitutioncipher;

import java.util.*;

public class CaesarCipher {

	public static String encrypted(String plainText, int shift) {

		// Check if shift exceeds 26 or it is negative value
		if (shift > 26) {
			shift = shift % 26;
		} else if (shift < 0) {
			// If key is -ve then we should add 26 and then do mod
			shift = (shift % 26) + 26;
		}

		String cipherText = "";

		for (int i = 0; i < plainText.length(); i++) {
			char ch = plainText.charAt(i);

			// To check each character from the plain text is alphabet or not
			if (Character.isLetter(ch)) {

				// To check weather given alphabet is lower case
				if (Character.isLowerCase(ch)) {
					// c holds the shifted char
					char c = (char) (ch + shift);

					// If c goes out of bound then we need to bring it back by values which should
					// range in 26 which is subtracted by shift
					if (c < 'z') {
						cipherText += (char) (ch - (26 - shift));
					} else {
						cipherText += c;
					}
				} else if (Character.isUpperCase(ch)) {

					char c = (char) (ch + shift);

					if (c < 'Z') {
						cipherText += (char) (ch - (26 - shift));
					} else {
						cipherText += c;
					}
				}
			} else {
				cipherText += ch;
			}
		}
		
		return cipherText;
	}

	public static void main(String[] args) {

		String str = "India";
		int key = 7;
		String encrypt = encrypted(str, key);
		System.out.println(encrypt);
	}

}

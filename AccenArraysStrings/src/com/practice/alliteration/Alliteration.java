package com.practice.alliteration;

import java.util.*;

public class Alliteration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter ");
		char letter = sc.next().charAt(0);

		sc.nextLine();
		String str = sc.nextLine();
		String str1 = str.toLowerCase();
		String[] words = str1.split(" ");

		int count = 0, flag = 1, temp = 3, kavi = 0;

		for (int i = 0; i < words.length; i++) {
			if (words[i].charAt(0) == letter) {
				count++;
			} else {
				flag = 0;
				break;
			}

		}

		if (flag == 0 || count > 3) {
			System.out.println("No score");
		} else {
			int hp = count - temp + 2;
			if (hp == kavi) {
				System.out.println("Good, You get a score of 2");
			} else {
				System.out.println("Good, You get a score of " + (hp * 2));
			}

		}

	}

}

package com.practice.uniquechar;

public class UniqueCharacter1 {
	
	public static void printDistinct(String testStr) {
		boolean result = testStr.matches("[a-z A-Z]+");
		if(!result) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		int[] count = new int[256];
		for(int i = 0;i < testStr.length();i++) {
			count[testStr.charAt(i)]++;
		}
		
		for(int i=0;i<255;i++) {
			if(count[i] == 1) {
				System.out.println((char)i);
			}
		}
	}

	public static void main(String[] args) {
		String str = "java is an object oriented programming language";
		printDistinct(str);
	}

}

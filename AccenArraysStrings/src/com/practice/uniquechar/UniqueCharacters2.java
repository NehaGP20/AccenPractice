package com.practice.uniquechar;

public class UniqueCharacters2 {
	
	public static boolean checkDistinct(String testStr) {
		int check = 0;
		for(int i=0;i<testStr.length();i++) {
			int intichar = testStr.charAt(i) - 'a';
			
			if((check & (1 << intichar)) > 0) {
				return false;
			}
			check |= (1 << intichar);
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		String str = "java is an object oriented programming language";
		System.out.println(checkDistinct(str));
	}

}

package com.practice.substitutioncipher;

import java.util.*;

public class SubstitutionCipher {

	public static String decrypt(String str, int key) {
		char ch;
		int a;
		String res = "";
		for(int i =0;i<str.length();i++) {
			ch = str.charAt(i);
			if(Character.isLetter(ch)){
				a = ch - key;
				if((Character.isUpperCase(ch) && a>90) || (Character.isLowerCase(ch) && a> 122)) {
					a = a-26;
				}	
				ch = (char)a;		
			}
			res = res + ch;
			
		}
		
		return res;
			
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the encrypted text: ");
		sc.nextLine();
		String str = sc.nextLine();
		int key = sc.nextInt();
		
		System.out.println("Cipher text: " + str);
		System.out.println();
		System.out.println("Plain text: "+ decrypt(str,key));
	//	StringBuilder temp = new StringBuilder();

//		for(int i=0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			if(ch == ' ') {
//				temp.append(" ");
//			}else if((ch < 0 && ch >= 64) || (ch > 90 && ch <= 96) || (ch >122 && ch<=127)) {
//				temp.append("");
//			}else if(Character.isUpperCase(ch)){
//				char gp = 
//			}else if(Character.isLowerCase(ch)) {
//				
//			}
//		}
	}

}

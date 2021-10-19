package com.practice.countnumchar;

import java.util.*;

public class RSolution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String str = sc.nextLine();
		
		if(str.matches("^[a-zA-Z ]*$")) {
			System.out.println(str+" has "+str.length()+ " characters");
		}else {
			System.out.println("Invalid Input");
		}
	}

}

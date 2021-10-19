package com.practice.kidsschool;

import java.util.*;

public class IsLetterRepeatedOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int len = str.length();
		if(((n1-n2)%str.length()) == 0){
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}
	}

}

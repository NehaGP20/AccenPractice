package com.clob.tokenauto;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the service type for first customer:");
		String type = sc.next();
		Token tp = new Token(type);
		
		System.out.println("Your Token number is:" + tp.getTokenNumber() 
		+ " and Counter number is:" + tp.getCounterNumber());
	}

}

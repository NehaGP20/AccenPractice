package com.practice.makenum;

import java.util.*;

public class MakeANumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		int flag = 0;
		if (size <= 0) {
			System.out.println("Invalid array size");
			return;
		}

		System.out.println("Enter the array elements:");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			if (temp >= 1 && temp <= 9 && temp % 2 == 0) {
				System.out.print(temp);
			}else {
				flag = 1;
			}
		}
		
		if(flag == 1) {
			System.out.println("Single digit even number is not found in the array");
		}
	}

}

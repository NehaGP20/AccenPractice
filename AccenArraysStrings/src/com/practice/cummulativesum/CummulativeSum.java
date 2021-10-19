package com.practice.cummulativesum;

import java.util.*;

public class CummulativeSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int num = sc.nextInt();
		if (num <= 0 || num > 20) {
			System.out.println("Invalid Range");
			System.exit(0);
		}

		int[] arr = new int[num];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < num-1; i++) {
			arr[i + 1] = arr[i] + arr[i + 1];
		
			if(i == 0) {
				System.out.print(arr[i] + " ");
			}
			System.out.print(arr[i + 1] + " ");
		}
	}

}

package com.practice.sumofcorresponding;

import java.util.*;

public class SumElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array: ");
		int n1 = sc.nextInt();

		if (n1 <= 0) {
			System.exit(0);
		}

		int[] arr1 = new int[n1];
		System.out.println("Enter elements for first array :");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
			sc.nextLine();
		}

		System.out.println("Enter the size of second array: ");
		int n2 = sc.nextInt();

		if (n1 <= 0) {
			System.exit(0);
		}

		int[] arr2 = new int[n2];
		System.out.println("Enter elements for second array :");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
			sc.nextLine();
		}

		System.out.println();
		if (arr1.length > arr2.length) {
			int[] arr3 = new int[arr1.length];
			for (int i = 0; i < arr1.length; i++) {
				arr3[i] = arr1[i] + arr2[i];

			}

			for (int i = 0; i < arr3.length; i++) {
				System.out.println(arr3[i]);
			}
		} else {
			int[] arr4 = new int[arr2.length];
			for (int i = 0; i < arr2.length; i++) {
				arr4[i] = arr2[i] + arr1[i];

			}

			for (int i = 0; i < arr4.length; i++) {
				System.out.println(arr4[i]);
			}
		}

	}

}

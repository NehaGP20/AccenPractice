package com.practice.interchangearrelements;

import java.util.*;

public class InterchangeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the first array: ");
		int n1 = sc.nextInt();

		if (n1 <= 0) {
			System.out.println("Invalid range");
			return;
		}
		int[] arr1 = new int[n1];
		System.out.println("Enter the elements in the first array");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter the number of elements in the second array: ");
		int n2 = sc.nextInt();

		if (n2 <= 0) {
			System.out.println("Invalid range");
			return;
		}

		if (n1 != n2) {
			System.out.println("Unable to swap size differs");
			return;
		}

		int[] arr2 = new int[n1];
		System.out.println("Enter the elements in the second array");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		for (int i = 0; i < arr1.length; i++) {

			arr1[i] = arr1[i] + arr2[i];
			arr2[i] = arr1[i] - arr2[i];
			arr1[i] = arr1[i] - arr2[i];
		}

		System.out.println("The first array after swapping is:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println();
		System.out.println("The second array after swapping is:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}

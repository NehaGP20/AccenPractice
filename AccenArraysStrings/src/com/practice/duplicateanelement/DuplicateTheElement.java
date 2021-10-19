package com.practice.duplicateanelement;

import java.util.*;

public class DuplicateTheElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();

		if (size <= 0) {
			System.out.println("Invalid array size");
			System.exit(0);
			// Exit out of the program
		}

		int[] arr = new int[size];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the position of the element to be replicated: ");
		int pos = sc.nextInt();

		sc.close();
		// Closing the scanner object

		if (pos > size - 1) {
			System.out.println("Position is greater than the size of an array");
			System.exit(0);
		}

		
		
		
		
		//Logic starts from here
		int[] arr1 = new int[size + 1];
		for (int i = 0; i < size; i++) {
			arr1[i] = arr[i];
		}
		arr1[size] = arr[pos];

		System.out.println();
		System.out.println("New Array: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " ");
		}
	}

}

package com.practice.findhighestmark;

import java.util.*;

public class HighestMarks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];

		for (int i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] <= 0) {
				System.out.println("Invalid Mark");
				return;
			}
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Highest mark is " + max);

	}

}

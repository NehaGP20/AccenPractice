package com.practice.highestmarksemwise;

import java.util.*;

public class HighestMarkSem {

	public static int findMax(int[] arr) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of semester: ");
		int sem = sc.nextInt();
		List<Integer> subject = new ArrayList<Integer>();

		for (int i = 0; i < sem; i++) {

			System.out.println("Enter no of subjects in " + (i + 1) + " semester:");
			int noSub = sc.nextInt();
			subject.add(noSub);
		}

		int[] maxOfSem = new int[subject.size()];

		for (int i = 0; i < subject.size(); i++) {
			System.out.println("Marks obtained in semester " + (i + 1));
			int[] arr = new int[subject.get(i)];
			for (int k = 0; k < arr.length; k++) {
				arr[k] = sc.nextInt();
			}

			int temp = findMax(arr);
			maxOfSem[i] = temp;
		}

		for (int i = 0; i < maxOfSem.length; i++) {
			System.out.println("Maximum mark in " + (i + 1) + " semester:" + maxOfSem[i]);
		}
	}

}

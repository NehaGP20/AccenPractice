package com.practice.tempsummary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[15];
		int count = 1;
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}

		List<Integer> dry = new ArrayList<Integer>();
		List<Integer> warm = new ArrayList<Integer>();
		List<Integer> cool = new ArrayList<Integer>();
		for (Integer num : input) {
			if (num > 30) {
				dry.add(num);
			} else if (num > 20 && num <= 30) {
				warm.add(num);
			} else if (num <= 20) {
				cool.add(num);
			}
		}

		System.out.println("Dry Temperature");
		for (int i = 0; i < dry.size(); i++) {
			System.out.print((count++) + "  ");
		}
		System.out.println();
		for (Integer n1 : dry) {
			System.out.print(n1 + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Warm Temperature");
		for (int i = 0; i < warm.size(); i++) {
			System.out.print((count++) + " ");
		}
		System.out.println();
		for (Integer n1 : warm) {
			System.out.print(n1 + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Cool Temperature");
		for (int i = 0; i < cool.size(); i++) {
			System.out.print((count++) + " ");
		}
		System.out.println();
		for (Integer n1 : cool) {
			System.out.print(n1 + " ");
		}

	}

}

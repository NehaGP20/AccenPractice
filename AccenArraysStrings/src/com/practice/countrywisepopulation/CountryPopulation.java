package com.practice.countrywisepopulation;

import java.util.*;

public class CountryPopulation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] country = new String[num];
		int[] pop = new int[num];

		sc.nextLine();
		for (int i = 0; i < num; i++) {
			country[i] = sc.nextLine();
		}
		for (int i = 0; i < num; i++) {
			pop[i] = sc.nextInt();
			sc.nextLine();
		}

		
		int[] temp = Arrays.copyOf(pop, num);
		Arrays.sort(pop);

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (temp[j] == pop[i]) {
					System.out.println(country[j]);
				}
			}
		}

	}

}

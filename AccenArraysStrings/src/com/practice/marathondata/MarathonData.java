package com.practice.marathondata;

import java.util.*;

public class MarathonData {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Double[] david = new Double[7];
		Double[] charles = new Double[7];
		Double[] anthony = new Double[7];
		Double[] leo = new Double[7];
		double sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
		for (int i = 0; i < david.length; i++) {
			david[i] = sc.nextDouble();
		}
		for (int i = 0; i < david.length; i++) {
			charles[i] = sc.nextDouble();
		}
		for (int i = 0; i < david.length; i++) {
			anthony[i] = sc.nextDouble();
		}
		for (int i = 0; i < david.length; i++) {
			leo[i] = sc.nextDouble();
		}

		for (int i = 0; i < david.length; i++) {
			sum1 = sum1 + david[i];
			sum2 = sum2 + charles[i];
			sum3 = sum3 + anthony[i];
			sum4 = sum4 + leo[i];
		}

		System.out.println("Total Distance covered by each participant: ");
		System.out.println("David " + String.format("%.2f", sum1) + " kms");
		System.out.println("Charles " + String.format("%.2f", sum2) + " kms");
		System.out.println("Anthony " + String.format("%.2f", sum3) + " kms");
		System.out.println("Leo " + String.format("%.2f", sum4) + " kms");

		System.out.println();
		System.out.println("Average distance covered on each day: ");
		System.out.println("Day1:" + String.format("%.2f", calculateaverage(david, charles, anthony, leo, 0)) + " kms");
		System.out.println("Day2:" + String.format("%.2f", calculateaverage(david, charles, anthony, leo, 1)) + " kms");
		System.out.println("Day3:" + String.format("%.2f", calculateaverage(david, charles, anthony, leo, 2)) + " kms");
		System.out.println("Day4:" + String.format("%.2f", calculateaverage(david, charles, anthony, leo, 3)) + " kms");
		System.out.println("Day5:" + String.format("%.2f", calculateaverage(david, charles, anthony, leo, 4)) + " kms");
		System.out.println("Day6:" + String.format("%.2f", calculateaverage(david, charles, anthony, leo, 5)) + " kms");
		System.out.println("Day7:" + String.format("%.2f", calculateaverage(david, charles, anthony, leo, 6)) + " kms");
		
	}

	public static double calculateaverage(Double[] david, Double[] charles, Double[] anthony, Double[] leo, int i) {
		double temp = (david[i] + charles[i] + anthony[i] + leo[i]) / 4;
		return temp;
	}

}

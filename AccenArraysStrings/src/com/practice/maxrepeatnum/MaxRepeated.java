package com.practice.maxrepeatnum;

import java.util.*;

public class MaxRepeated {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0;i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int[] visitedArr = new int[num];
		int visited = -1;
		
		for(int i = 0;i<arr.length;i++) {
			int count = 1;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					visitedArr[j] = -1;
				}
			}
			if(visitedArr[i] != visited) {
				visitedArr[i] = count;
			}
		}
		
		int max = visitedArr[0];
		int hp = 0;
		for(int k = 1;k < visitedArr.length;k++) {
			if(max < visitedArr[k]) {
				max = visitedArr[k];
				hp = arr[k];
			}
		}

		
		System.out.println(hp);
		sc.close();
	}

}

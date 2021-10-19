package com.practice.noofnewwords;

import java.util.*;

public class NoOfNewWords {

	public static void main(String[] args) {

		String str = "Hello Everybody, welcome to collection in JAVA. Collection, is like a container and powerful concept in Java!";
		//String str = "hello Hello HEllo hi hi: hi! Welcome,   welcome";
		String[] words = str.split("[\\s,;:.?!]+");
		TreeSet<String> set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		for(String word: words) {
			set.add(word);
		}
		
		System.out.println("No of words used: " + words.length);
		System.out.println("No of Unique words: " + set.size());
		int count = 1;
		for(Object temp: set) {
			System.out.println(count +". "+ temp);
			count++;
		}
		
		
		
	}

}

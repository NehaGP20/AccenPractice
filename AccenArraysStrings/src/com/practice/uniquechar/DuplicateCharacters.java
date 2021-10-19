package com.practice.uniquechar;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String str = "How many duplicates are there";
		String duplicate = "";
		String sentence = "";
		//H
		//Ho
		//How
		for(int i=0;i<str.length();i++) {
			
			String current = Character.toString(str.charAt(i));
			if(sentence.contains(current)) {
				if(!duplicate.contains(current))
					duplicate += current;
			}
			
			sentence += str.charAt(i);
		}
		
		System.out.println(duplicate);
		
	}

}

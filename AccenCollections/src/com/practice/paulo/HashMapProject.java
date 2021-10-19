package com.practice.paulo;

import java.util.*;

public class HashMapProject {

	public static void main(String[] args) {

		HashMap<String, Integer> users = new HashMap<>();
		users.put("Neha", 90);
		users.put("Anjana", 85);
		users.put("Lekhana", 82);
		
		if(users.containsKey("Prateek")) {
			System.out.println("Yay");
		}else {
			System.out.println("Nay");
		}
		
		System.out.println();
		
		System.out.println("Fetching value from key: " + users.get("Anjana"));
		System.out.println();
		System.out.println("Fetching only values: "+users.values());
		System.out.println();
		System.out.println("Fetching entire hashmap: " + users.entrySet());
		System.out.println();
		
		Iterator itr = users.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry pair = (Map.Entry) itr.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());
		}
	}

}

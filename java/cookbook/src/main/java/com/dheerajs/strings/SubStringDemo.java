package com.dheerajs.strings;

public class SubStringDemo {
	public static void main(String[] av) {
		String a = "Java is Great";
		System.out.println(a);
		System.out.println(a.substring(5));
		System.out.println(a.substring(5, 7));
		System.out.println(a.substring(5, a.length()));
		
		String b = "Hello to the World of Java";
		for (String word : b.split(" ")) {
			System.out.println(word);
		}
	}
}

package com.dheerajs.strings;

public class StringCharAt {
	public static void main(String[] args) {
		String a = "A quick bronze fox lept a lazy bovine";
		for (int i = 0; i < a.length(); i++)
			System.out.print(a.charAt(i));
		
		System.out.println();
		
		String b = "Hello world!";
		for (char c : b.toCharArray())
			System.out.print(c);
	}

}

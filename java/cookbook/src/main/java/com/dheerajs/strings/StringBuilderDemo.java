package com.dheerajs.strings;

public class StringBuilderDemo {
	public static void buildString() {
		String s1 = "Hello" + ", " + "World";
		System.out.println(s1);
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("Hello");
		sb2.append(",");
		sb2.append(" ");
		sb2.append("World");
		
		String s2 = sb2.toString();
		System.out.println(s2);
		
		System.out.println(
			new StringBuilder()
				.append("Hello")
				.append(", ")
				.append("")
				.append("World")
		);
	}

	public static void main(String[] args) {
		buildString();
	}

}

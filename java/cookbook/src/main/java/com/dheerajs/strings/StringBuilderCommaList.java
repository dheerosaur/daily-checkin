package com.dheerajs.strings;

import java.util.StringTokenizer;

public class StringBuilderCommaList {
	public final static String SAMPLE_STRING = "Hello world of Java";

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		for (String word : SAMPLE_STRING.split(" ")) {
			if (sb1.length() > 0) {
				sb1.append(", ");
			}
			sb1.append(word);
		}
		System.out.println(sb1);
		
		StringTokenizer st = new StringTokenizer(SAMPLE_STRING);
		StringBuilder sb2 = new StringBuilder();
		while (st.hasMoreElements()) {
			sb2.append(st.nextToken());
			if (st.hasMoreElements()) {
				sb2.append(", ");
			}
		}
		System.out.println(sb2);
	}

}

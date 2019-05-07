package com.dheerajs.strings;

public class UnicodeChars {
	public static void main(String[] args) {
		StringBuffer b = new StringBuffer();
		
		for (char c = 'a'; c < 'd'; c++) {
			b.append(c);
		}
		
		b.append('\u00a5');
		b.append('\u01FC');
		b.append('\u0391');
		b.append('\u03A9');
		
		for (int i = 0; i < b.length(); i++) {
			System.out.printf("Character #%d %04x is %c%n", i, (int)b.charAt(i), b.charAt(i));
		}
	}

}

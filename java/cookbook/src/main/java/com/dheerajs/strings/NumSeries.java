package com.dheerajs.strings;

import java.util.BitSet;

public class NumSeries {
	protected static String months[] = {
		"January", "February", "March", "April", "May", "June", "July", "August",
		"September", "October", "November", "December"
	};

	public static void main(String[] args) {
		for (int i = 1; i <= months.length; i++) {
			System.out.println("Month #" + i);
		}
		
		for (int i = 0; i < months.length; i ++) {
			System.out.println("Month " + months[i]);
		}
		
		for	(int i = 11; i <= 27; i += 3) {
			System.out.println("i = " + i);
		}
		
		BitSet b = new BitSet();
		b.set(0);
		b.set(3);
		b.set(8);
		
		for (int i = 0; i < months.length; i ++) {
			if (b.get(i))
				System.out.println("Month " + months[i]);
		}
		
		int[] numbers = {0, 3, 8};
		for (int n = 0; n < numbers.length; n ++) {
			System.out.println("Month " + months[n]);
		}
		
	}

}
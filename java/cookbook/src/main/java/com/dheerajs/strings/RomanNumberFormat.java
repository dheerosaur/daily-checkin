package com.dheerajs.strings;

public class RomanNumberFormat {
	final static char A2R[][] = {
		{0, 'M'},
		{0, 'C', 'D', 'M'},
		{0, 'X', 'L', 'C'},
		{0, 'I', 'V', 'X'},
	};
	
	static class R2A {
		char ch;
		public R2A(char ch, int amount) {
			super();
			this.ch = ch;
			this.amount = amount;
		}
		int amount;
	}

}

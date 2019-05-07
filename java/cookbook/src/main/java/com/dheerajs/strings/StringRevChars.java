package com.dheerajs.strings;

import java.util.Stack;
import java.util.StringTokenizer;

public class StringRevChars {
	public static void main(String[] args) {
		String sh = "ABCDEFG";
		System.out.println(sh + " -> " + new StringBuffer(sh).reverse());
		
		String s = "Father Charles Goes Down And Ends Battle";
		
		Stack<String> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			stack.push(st.nextToken());
		}
		
		System.out.println("Reversed is : ");
		
		while(!stack.empty()) {
			System.out.print(stack.pop() + ' ');
		}
	}

}
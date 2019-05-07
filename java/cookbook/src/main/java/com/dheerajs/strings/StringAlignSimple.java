package com.dheerajs.strings;

public class StringAlignSimple {
	public static void main(String[] args) {
		StringAlign formatter = new StringAlign(70, StringAlign.Justify.CENTER);
		
		System.out.println(formatter.format(" - i - "));
		System.out.println(formatter.format("4"));
	}

}
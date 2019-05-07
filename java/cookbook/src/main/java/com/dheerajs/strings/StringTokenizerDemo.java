package com.dheerajs.strings;
import java.util.StringTokenizer;
import java.util.regex.*;

public class StringTokenizerDemo {
	public final static int MAXFIELDS = 5;
	public final static String DELIM = "|";

	private static void tokenizerDemo1 () {
	    StringTokenizer st = new StringTokenizer("Hello World");
	    while(st.hasMoreTokens())
	        System.out.println("1: " + st.nextToken());
	}
	
	private static void tokenizerDemo2 () {
	    StringTokenizer st2 = new StringTokenizer("1_2|3", "_|");
	    while(st2.hasMoreElements())
	    	System.out.println("2: " + st2.nextElement());
	}
	
	private static void tokenizerDemo3 () {
	    StringTokenizer st2 = new StringTokenizer("1_2|3", "_|", true);
	    while(st2.hasMoreElements())
	    	System.out.println("3: " + st2.nextElement());
	}

	private static String[] process(String line) {
		String[] results = new String[MAXFIELDS];
		
		StringTokenizer st = new StringTokenizer(line, DELIM, true);
		int i = 0;
		
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			if (s.contentEquals(DELIM)) {
				if (i++ >= MAXFIELDS)
					throw new IllegalArgumentException("Input line " + line + " has too many fields");
				continue;
			}
			results[i] = s;
		}
		return results;
	}
	
	private static String[] processRegex(String line) {
		String[] results = new String[3];
		Matcher token = Pattern.compile("\\d+").matcher(line);
		int i = 0;
		while (token.find()) {
			String match = token.group(0);
			results[i++] = match;
		}
		return results;
	}
	private static void printResults(String input, String[] outputs) {
		System.out.println("Input :" + input);
		int i = 0;
		for (String s: outputs)
			System.out.println("Output: " + ++i + " was: " + s);
	}
	
	public static void main(String[] args) {
		tokenizerDemo1();
		tokenizerDemo2();
		tokenizerDemo3();
		printResults("A|B|C|D|E", process("A|B|C|D|E"));
		printResults("123,345,678", processRegex("123,456,789"));
	}

}
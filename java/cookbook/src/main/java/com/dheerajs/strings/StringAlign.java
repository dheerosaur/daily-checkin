package com.dheerajs.strings;
import java.text.FieldPosition;

public class StringAlign {
	
	public enum Justify {
		LEFT,
		CENTER,
		RIGHT,
	}
	
	private Justify just;
	private int maxChars;
	
	public StringAlign(int maxChars, Justify just) {
		switch(just) {
		case LEFT:
		case CENTER:
		case RIGHT:
			this.just = just;
			break;
		default:
			throw new IllegalArgumentException("invalid justification arg");
		}
		
		if (maxChars < 0) {
			throw new IllegalArgumentException("maxChars must be positive.");
		}
		
		this.maxChars = maxChars;
	}
	
	public StringBuffer format(Object input, StringBuffer where, FieldPosition ignore) {
		String s = input.toString();
		String wanted = s.substring(0, Math.min(s.length(), maxChars));
		
		switch (just) {
			case RIGHT:
				pad(where, maxChars - wanted.length());
				where.append(wanted);
				break;
			case CENTER:
				int toAdd = maxChars - wanted.length();
				pad(where, toAdd / 2);
				where.append(wanted);
				pad(where, toAdd - toAdd / 2);
				break;
			case LEFT:
				where.append(wanted);
				pad(where, maxChars - wanted.length());
				break;
		}
		return where;
	}
	
	protected final void pad(StringBuffer to, int howMany) {
		for (int i=0; i < howMany; i++)
			to.append(' ');
	}
	
	String format(String s) {
		return format(s, new StringBuffer(), null).toString();
	}
}

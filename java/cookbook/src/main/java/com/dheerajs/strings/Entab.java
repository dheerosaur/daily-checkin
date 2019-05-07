package com.dheerajs.strings;
import java.io.*;

public class Entab {
	protected Tabs tabs;
	
	public int getTabSpacing() {
		return tabs.getTabSpacing();
	}

	public Entab(int n) {
		tabs = new Tabs(n);
	}
	
	public Entab() {
		tabs = new Tabs();
	}
	
	
	public static void main(String[] argv) throws IOException {
		Entab et = new Entab(8);
		if (argv.length == 0) {
			et.entab(
				new BufferedReader(new InputStreamReader(System.in)),
				System.out); 
		} else {
			for (String fileName : argv) {
				et.entab(
					new BufferedReader(new FileReader(fileName)),
					System.out);
			}
		}
	}
	
	public void entab(BufferedReader is, PrintWriter out) throws IOException {
		String line;
		
		while ((line = is.readLine()) != null) {
			out.println(entabLine(line));
		}
	}
	
	public void entab(BufferedReader is, PrintStream out) throws IOException {
		entab(is, new PrintWriter(out));
	}
	
	
	public String entabLine(String line) {
		int N = line.length(), outCol = 0;
		StringBuffer sb = new StringBuffer();
		char ch;
		int consumedSpaces = 0;
		
		for (int inCol = 0; inCol < N; inCol++) {
			ch = line.charAt(inCol);
			if (ch == ' ') {
				if (!tabs.isTabStop(inCol)) {
					consumedSpaces++;
				} else {
					sb.append('\t');
					outCol += consumedSpaces;
					consumedSpaces = 0;
				}
				continue;
			}
			
			while (inCol - 1 > outCol) {
				sb.append(' ');
				outCol++;
			}
			
			sb.append(ch);
			outCol++;
		}
		
		for (int i = 0; i < consumedSpaces; i++) {
			sb.append(' ');
		}
		return sb.toString();
	}
}
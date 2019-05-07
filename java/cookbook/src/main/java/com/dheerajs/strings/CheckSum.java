package com.dheerajs.strings;
import java.io.*;

public class CheckSum {
	public static void main(String[] args) {
		String fname = "/tmp/checksum.txt";

		try(PrintWriter pr = new PrintWriter(new File(fname))) {
			pr.println("Test 123");
			pr.println("Test 234");
		} catch (FileNotFoundException e) {
		}

		try (FileReader in = new FileReader(fname)) {
			BufferedReader bf = new BufferedReader(in);
			System.out.println(process(bf));
		} catch (IOException e) {
		}
	}
	
	public static int process(BufferedReader is) {
		int sum = 0;
		try {
			String inputLine;
			
			while ((inputLine = is.readLine()) != null) {
				int i;
				for (i = 0; i < inputLine.length(); i++) {
					sum += inputLine.charAt(i);
				}
			}
		} catch (IOException e) {
			throw new RuntimeException("IOException " + e);
		}
		return sum;
	}
}

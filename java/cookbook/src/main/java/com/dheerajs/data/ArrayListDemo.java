package com.dheerajs.data;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(new Integer(1));
		al.add(new Integer(2));
		al.add(new Integer(3));
		al.add(new Integer(4));
		
		System.out.println("Retrieving by index.");
		
		for (int i=0; i < al.size(); i++) {
			System.out.println("Element " + i + " is " + al.get(i));
		}
	}

}
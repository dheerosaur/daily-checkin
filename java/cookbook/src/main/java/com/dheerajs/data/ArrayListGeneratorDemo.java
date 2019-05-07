package com.dheerajs.data;
import java.util.*;

public class ArrayListGeneratorDemo {
	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<>();
		Map<Integer, String> map = new HashMap<>();
		data.add("hello");
		data.add("world");

		map.put(1, "self");
		map.put(2, "fels");
		
		data.forEach(s -> System.out.println(s));
		map.forEach((i, j) -> System.out.println(i + j));
	}

}
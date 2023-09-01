package com.example.helloworld.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateEntry {

	public static void main(String[] args) {

		List<String> input = new ArrayList<>();
		input.add("abc");
		input.add("abc");
		input.add("abc");
		input.add("xyz");
		input.add("edf");
		input.add("xyz");
		input.add("pqr");
		input.add("abcd");
		//input.remove("abc")
		
		System.out.println(input);
		
		List<String> output = new ArrayList<>();
		for (int i = 0; i < input.size(); i++) {
			String val = input.get(i);
		    input.remove(i);
			if (input.contains(val)) {
				if(!output.contains(val))
					output.add(val);
			}
			input.add(i, val);
		}
		System.out.println("output : " + output);
	}
}

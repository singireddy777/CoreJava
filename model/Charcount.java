package com.example.helloworld.model;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Charcount {

	public static void main(String[] args) {
		
		String str = "programming";
		
		String ref ="abcdefghijklmnopqrstuvwxyz";
		
		char[] ch = str.toCharArray();
		
		Stream<char[]> sc = Stream.of(ch);
		
		//Map<Character, Long> charFrequency = sc.flatMap(a -> a.chars().mapToObj(c -> (char) c)) // Stream<Character>
		//        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
	}
}

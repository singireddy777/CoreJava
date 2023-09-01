package com.example.helloworld.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsFrom3Lists {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> list2 = Arrays.asList(1, 3);
		List<Integer> list3 = Arrays.asList(1, 3, 7, 8, 9, 0);
		
		List<Integer> commonElements = list1.stream()
				.filter(list2::contains)
				.filter(list3::contains)
				.collect(Collectors.toList());

		System.out.println("Common Elements: " + commonElements);
	}
}

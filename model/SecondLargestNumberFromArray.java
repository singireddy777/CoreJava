package com.example.helloworld.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumberFromArray {

	public static void main(String[] args) {

		String str1 = new String("vensee");
		String str2 = new String("vensee");
		
		System.out.println("comparing with ==: "+str1==str2);
		System.out.println("comparing with equals: "+str1.equals(str2));
		
		findNthLargestNumberFromArray();
		findSecondLargestNumber();
	}

	public static void findNthLargestNumberFromArray() {

		int[] a = { 1, 2, 3, 5, 5, 7, 55, 43, 32, 21, 76 };

		@SuppressWarnings("rawtypes")
		List<Integer> inputList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 5, 7, 55, 43, 32, 21, 76));
		List<String> stringsList = List.of("string", "char", "boolean", "int");
		System.out.println("the strings list" + stringsList);
		Set<Integer> inputSet = new TreeSet<>(inputList);
		inputList.clear();
		for (int value : inputSet) {
			inputList.add(value);
		}
		int n = inputList.size();

		System.out.println("the second larget element in array is: " + inputList.get(n - 1));
		System.out.println("the second larget element in array is: " + inputList.get(n - 2));
	}

	public static void findSecondLargestNumber() {
		int[] numbers = { 12, 34, 5, 23, 45, 67, 56, 89 };
		List<Integer> inputList = Arrays.asList(12, 34, 5, 23, 45, 67, 56, 89);
		int secondLargest = Arrays.stream(numbers).distinct() // Remove duplicates if needed
				.boxed() // Convert to Integer objects for sorting
				.sorted((a, b) -> b - a) // Sort in descending order
				.skip(1) // Skip the first element (largest)
				.findFirst() // Get the second largest element
				.orElse(-1); // Default value if array is empty or has one element
        int result = inputList.stream().sorted((a,b)->(b-a)).skip(1).findFirst().orElse(-1);
        System.out.println("second largest from Array list: "+result);
		System.out.println("Second largest number: " + secondLargest);
	}
}

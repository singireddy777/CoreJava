package com.example.helloworld.model;

import java.util.TreeSet;

public class TreeSetOrderTest {
	public static void main(String[] args) {
		TreeSet<StringBuilder> builderSet = new TreeSet<StringBuilder>();
		builderSet.add(new StringBuilder("vensee"));
		builderSet.add(new StringBuilder("apple"));
		builderSet.add(new StringBuilder("banana"));
		builderSet.add(new StringBuilder("orange"));
		builderSet.add(new StringBuilder("grape"));
		builderSet.stream().forEach((n) -> System.out.println(n));
		// Print the elements in natural order
//		for (StringBuilder sb : treeSet) {
//			System.out.println(sb);
//		}

		TreeSet<StringBuffer> bufferSet = new TreeSet();
		bufferSet.add(new StringBuffer("Shreedhar babu"));
		System.out.println(bufferSet);

	}
}

package com.example.helloworld.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class ReplaceCharacter {

	public static void main(String[] args) {

		String myString = replaceCharacterWithAnother("Programming");
		System.out.println("The replaced String is :" + myString);
		String[] arr = { "bat", "eat", "ate", "tea", "tan", "nat" };
		// sortingArray();
		List<List<String>> anagramGroups = groupAnagrams(arr);
		System.out.println("the anagrams now..." + anagramGroups);
		compareTwoStrings("vensee", "venseee");

		List<Employeee> empList = new ArrayList<>();
		empList.add(new Employeee("vensee", 1234L, 10000.0));
		empList.add(new Employeee("venkat", 2345L, 20000.0));
		empList.add(new Employeee("sudheepa", 4567L, 20000.0));
		empList.add(new Employeee("raju", 5678L, 12000.0));
		// seperate the Employee based on salary range we can use groupingBy method here
		// on list after stream()
		Map<Double, List<Employeee>> employeeMap = empList.stream()
				.collect(Collectors.groupingBy(Employeee::getEmpSalary));
		//empList.stream().collect(Collectors.groupingBy(Employeee::getEmpName));

		System.out.println("after separating the employees based on their salaries: " + employeeMap);
		// sort the employees based on their salary
		empList.sort(Comparator.comparing(Employeee::getEmpSalary));
		System.out.println(empList);
		empList.forEach(System.out::println);
		
		
		obtainduplicateEntriesFromList();
	}

	public static String replaceCharacterWithAnother(String string) {
		String resultString = string.replace('m', 'n');
		return resultString;
	}

	public static List<List<String>> groupAnagrams(String[] wordArr) {
		// String[] words = {"tab","bat","ate","eat"};//anagrams

		Map<String, List<String>> anagramGroups = new HashMap<>();
		for (String word : wordArr) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String sortedWord = new String(chars);

			// abt ,abt,aet,aet

			System.out.println("printing the chars here: " + sortedWord);
			anagramGroups.putIfAbsent(sortedWord, new ArrayList<>());
			// abt - abt , []
			// {abt:["tab","bat"]}
			anagramGroups.get(sortedWord).add(word);
		}
		return new ArrayList<>(anagramGroups.values());
	}

	public static void sortingArray() {
		String[] arr = { "bat", "eat", "ate", "tea", "tan", "nat" };
		for (String word : arr) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String sortedString = new String(chars);
			System.out.println("zzzzz" + sortedString);
		}
	}

	public static void compareTwoStrings(String str1, String str2) {
		if (str1.equals(str2)) {
			System.out.println("the provided two strings are equal");
		} else if (!str1.equals(str2)) {
			System.out.println("the provided two strings are not equal");
		} else
			System.out.println("they are not even same in content wise also");
	}
	
	public static void obtainduplicateEntriesFromList() {
		List<String> input = new ArrayList<>();
		input.add("abc");
		input.add("abc");
		input.add("abc");
		input.add("xyz");
		input.add("edf");
		input.add("xyz");
		input.add("pqr");
		input.add("abcd");
		System.out.println(input);

		List<String> output = new ArrayList<>();

		for (int i = 0; i < input.size(); i++) {
			String val = input.get(i);
			input.remove(i);

			if (input.contains(val)) {
				if (!output.contains(val))
					output.add(val);
			}
			input.add(i, val);
		}
		System.out.println("output : " + output);
	}
	}

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Employeee {
	private String empName;
	private Long empId;
	private Double empSalary;
}

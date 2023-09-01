package com.example.helloworld.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

public class MapFilterExample {
	public static void main(String[] args) {

		MapFilterExample mf = new MapFilterExample();
		mf.operation("Hello");
		mf.operation(new String("World..!"));
		String s = new String("Mango");
		mf.operation((Object) s);
		mf.operation(null);
		mf.sortTheArray();
		List<Integer> intList = Arrays.asList(1, 2, 4, 3, 5, 3, 5, 7, 6, 9);
		Set<String> namesSet = new HashSet<>();
		namesSet.add("first");
		namesSet.add("second");
		namesSet.add("third");
		namesSet.add("four");
		namesSet.add("five");
		namesSet.add("six");
		Set<String> resultsInSet = namesSet.stream().limit(4).collect(Collectors.toSet());
		System.out.println("the first four elements in the set: "+resultsInSet);
 		//IntStream.range(1, 10).forEach(System.out::println); //to print 1 to 10
		List<Integer> firstNElementsList = intList.stream().limit(5).collect(Collectors.toList()); // to print first n // elements
		List<Integer> findFirst3Elements = intList.stream().limit(3).collect(Collectors.toList());																						
		System.out.println("the first five elements in a given array are: " + firstNElementsList);
		List<String> duplicates = getOnlyDuplicates();
		System.out.println("the duplicates are: " + duplicates);
		obtainItemsFromMap();
		convertListToMap();
		List<Integer> numbersList = Arrays.asList(22, 32, 11, 43, 24);
		List<String> stringsList = Arrays.asList("Vensee", "Shree", "Vishal", "SCM/FCDE", "SDOM", "bangtp", "cobgtp");

		List<Integer> squaredList = numbersList.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println("the squared list: " + squaredList);

		numbersList.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

		List<Integer> evenNumbersList = numbersList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println("The even numbers: " + evenNumbersList);

		Collections.sort(numbersList, Comparator.naturalOrder());
		System.out.println("after sorting ascending order : " + numbersList);

		Collections.sort(numbersList, Comparator.reverseOrder());
		System.out.println("after sorting descending order : " + numbersList);

		Collections.sort(stringsList, Comparator.naturalOrder());
		System.out.println("Strings after sorting ascending order : " + stringsList);

		Collections.sort(stringsList, Comparator.reverseOrder());
		System.out.println("Strings after sorting descending order : " + stringsList);
		String name = "venkat reddy singireddy";
		String result = Stream.of(name.split(" ")).reduce("", (c, r) -> (r + c));
		System.out.println("The name is: " + result);

		List<String> companyList = new ArrayList<>();
		companyList.add("Google");
		companyList.add("Microsoft");
		companyList.add("Apple");
		companyList.stream().sorted().forEach(System.out::println);
		List<String> ascendList = companyList.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted ascending: " + ascendList);
		companyList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		List<String> descendList = companyList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("sorted descending: " + descendList);

		Map<String, String> employeeMap = new HashMap<>();
		employeeMap.put("Vensee", "New York");
		employeeMap.put("Vishal", "London");
		employeeMap.put("Shreedhar", "Paris");
		employeeMap.put("Sunil", "Sydney");
		employeeMap.put("Gouthi", "Tokyo");
		employeeMap.put("Dee", "Singapore");
		employeeMap.put(name, result);

		String desiredEmployee = "Vensee";

		String desiredCity = employeeMap.entrySet().stream().filter(entry -> entry.getKey().equals("Vensee"))
				.map(Map.Entry::getValue).findFirst().orElse(null);

		if (desiredCity != null && !desiredCity.isEmpty()) {
			System.out.println("the desired city for Vensee is: " + desiredCity);
		} else {
			System.out.println("Employee " + desiredEmployee + " not found in the map.");
		}
	}

	public static List<String> getOnlyDuplicates() {

		List<String> namesList = new ArrayList<>();
		namesList.add("vensee");
		namesList.add("venky");
		namesList.add("bosch");
		namesList.add("vensee");
		namesList.add("venky");
		namesList.add("bosch");
		namesList.add("shree");
		namesList.add("reddy");
		namesList.add("infy");

		Collections.sort(namesList);
		System.out.println("the sorted list is: " + namesList);

		Set<String> uniqueNamesSet = new HashSet<String>();
		List<String> duplicatesList = new ArrayList<>();
		for (String name : namesList) {
			if (!uniqueNamesSet.add(name)) {
				duplicatesList.add(name);
			}
		}
		return duplicatesList;
	}
	public void operation(String str) {
		System.out.println("from string method:" + str);
	}

	public void operation(Object obj) {
		System.out.println("from the Object method: " + obj);
	}
	@SuppressWarnings("unchecked")
	public static void obtainItemsFromMap() {
		Map<String, Myclass> almMap = new HashMap<String, Myclass>();
		almMap.put("null", new Myclass("vensee", "ALM", "sequence", "abc@github.com", "mapped", "VCU team area"));
		almMap.put("mapItem1",
				new Myclass("vensee1", "ALM1", "sequence1", "abc@github.com1", "mapped1", "VCU team area1"));
		almMap.put("mapItem2",
				new Myclass("vensee2", "ALM2", "sequence2", "abc@github.com2", "mapped2", "VCU team area2"));
		almMap.put("mapItem3",
				new Myclass("vensee3", "ALM3", "sequence3", "abc@github.com3", "mapped3", "VCU team area3"));
		System.out.println("the almMap is: "+almMap.toString());
		Map<String, Myclass> keyMatchedEntryOrMap = almMap.entrySet().stream()
				.filter(element -> element.getKey().equals("mapItem1"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println("the required map is: "+ keyMatchedEntryOrMap);		
	}
	public static void convertListToMap() {
		
		List<String> stringsList = new ArrayList<>();
		stringsList.add("Delhi");
		stringsList.add("Hyderabad1");
		stringsList.add("Bangalore");
		stringsList.add("Chennai");
		Map<Integer,String> mapItems1 = stringsList.stream().collect(Collectors.toMap(String::length, elements->elements));
		System.out.println("after converting list to Map: "+mapItems1);
	}
	public void sortTheArray() {

       String[] stringArray = {"hyd","cob","ban","vensee","ban1","ban2"};
       List<String> stringsList = Arrays.asList(stringArray);
       List<String> resultString = stringsList.stream().filter(ex->ex.contains("ban")).collect(Collectors.toList());
       System.out.println("the result list is: "+resultString);
	List<Integer> numsList = Arrays.asList(1,6,6,7,3,4,5,7,8,9);
	//List<Integer> resultList = numsList.stream().sorted().collect(Collectors.toList());
	Collections.sort(numsList);
	System.out.println("the result after sorting the Array: "+numsList);
	//System.out.println("the result after sorting the Array: "+resultList);
	
	
	}
}





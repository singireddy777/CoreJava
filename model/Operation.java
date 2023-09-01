package com.example.helloworld.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.IntStream;
import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.util.StringUtils;


public class Operation {

	public static void main(String[] args) throws ParseException {
		
		//String filepath= "C:/Users/EFN1KOR/Desktop/PRPayload.json";
		String filePath = "./src/PRPayload.json";
		File file = new File(filePath);
		System.out.println(new File(".").getAbsolutePath());
		FileReader reader = null;
		try {
			reader = new FileReader(file);
			System.out.println("the reader response :"+reader.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        JSONParser parser = new JSONParser(reader);
        System.out.println("parser response: "+parser.toString());
        Object jsonObjectList = parser.parse();
        //JSONArray jsonObject = (JSONArray)jsonObjectList;
        //JSONObject jsonObject1 = (JSONObject)jsonObjectList;
        //String jsonStr = jsonObject1.toJSONString();
        System.out.println("the json data is: "+jsonObjectList);
       // System.out.println(" the actual json data is :"+jsonStr);
        
//		try {
//			
//            //Use JSONObject for simple JSON and JSONArray for array of JSON.
//            org.json.simple.JSONArray jsonArray = new org.json.simple.JSONArray() parser.parseArray(new FileReader(file));
//            JSONObject data = (JSONObject) parser.parse(
//                  new FileReader(file));//path to the JSON file.
//         System.out.println(data);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
        
        
        
		Set<String> mySet = new HashSet<>();
		Operation op = new Operation();
		op.decoder("73646F6D324749546D6967726174696F6E313233");
		op.doReverse();
		
		obtainThemaximumOccuredCharacter("Swamiye Sharanam Ayyappa");
		charsOccuranceCountInAString("Singireddy Venkat Reddy Kadaparthy Nakrekal");
		String result = removeDuplicatesFromString("the latest java version is java21");
		System.out.println("after removing the duplicates from a given string the result is: "+result);
		int resultForCount = Operation.countWordsInAString("Singireddy Venkat Reddy");
		System.out.println("the word count in a given string is: " + resultForCount);
		int charCount = op.charCountInAString("Singireddy Venkat Reddy Kadaparthy Nakrekal");
		System.out.println("the character count in a given string is: " + charCount);


		int i = 5;

		int j = i += 2;

		System.out.println("the j value is: " + j);
		String password = "73646F6D324749546D6967726174696F6E313233";
		int password1 = password.length() - 1;
		System.out.println("password1 value is: " + password1);
		for (int i1 = 0; i1 < password.length() - 1; i1 += 2) {
			String pair = password.substring(i1, (i1 + 2));
			System.out.println("and the pair value is: " + pair);
			// int decimal = Integer.parseInt(pair, 16);
			// builder.append((char) decimal);
			// System.out.println("and the decimal value is: "+builder.toString());
		}
//		mySet.add(new Student(234,"vensee","venky","vensee@gmail.com"));
//		mySet.add(new Student(234,"kdp","venky","kdp@gmail.com"));
//		mySet.add(new Student(234,"nkl","venky","nkl@gmail.com"));
//		mySet.add(new Student(234,"nlg","venky","nlg@gmail.com"));
//		mySet.add(new Student(234,"hyd","venky","hyd@gmail.com"));
		mySet.add("venky");
		mySet.add("kdp");
		mySet.add("nkl");
		mySet.add("nlg");
		mySet.add("hyde");

		System.out.println("before sorting the Set values: " + mySet);
		List<String> mySortedList = new ArrayList<>(mySet);

		// Set<String> newSet = new HashSet<>(mySortedList); //this will remove the
		// duplicate elements presented in the list.
		Collections.sort(mySortedList);// if you want to compare object elements we should use comparable or comparator
										// interface
		System.out.println("after sorting the set with List: " + mySortedList);

	}

	public String decoder(String password) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < password.length() - 1; i += 2) {
			String pair = password.substring(i, (i + 2));
			
			int decimal = Integer.parseInt(pair, 16);
			
			builder.append((char) decimal);

			System.out.println("the encoded password is: " + builder.toString()+" : "+pair + " : "+decimal);
		}
		return builder.toString();
	}

	// for String reverse
	public void doReverse() {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("please enter the string to reverse...");
		String str = "vensee";
		String result = "";
		char[] chars = str.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {

			result = result + str.charAt(i);
		}
		System.out.println("the reversed string is: " + result);
	}

	// To count how many words are there in a given string
	public static int countWordsInAString(String s) {

		if (s == null || s.length() == 0 || s.isEmpty()) {
			return 0;
		}
		String[] words = s.split("\\s+");

		return words.length;
	}

	// To find characters count in a given String
	public int charCountInAString(String string) {

		int count = 0;
		if (string == null || string.length() == 0 || string.isEmpty()) {
			return 0;
		}
		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) != ' ')
				
			count++;
		}
		return count;
	}

	// To find how many times a character is repeated/occured in a given string
	public static void charsOccuranceCountInAString(String inputString) {
		Map<Character, Integer> charsMap = new HashMap<>();// at this stage charsMap having no key or no value
		char[] chars = inputString.toCharArray();
		System.out.println("the a's count is: " + StringUtils.countOccurrencesOf(inputString, "a"));
		for (char c : chars) {
			if (charsMap.containsKey(c)) {

				charsMap.put(c, charsMap.get(c) + 1); // if we need repeated characters count from a given string, this
														// will be used.
				// charsMap.remove(c);//is for only non-repeated characters.
			} else if (charsMap.containsKey(' ')) {
				charsMap.remove(' ');
			}

			else {
				charsMap.put(c, 1);
			}
		}
		System.out.println("The Occurance of each character in the given string: " + charsMap);
	}

	public static void obtainThemaximumOccuredCharacter(String str) {

		// create HashMap to store frequency of every character
		HashMap<Character, Integer> mp = new HashMap<>();
		char maxOccured = 0;
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			// push element into map and increase its frequency
			char c = str.charAt(i);
			mp.put(c, mp.getOrDefault(c, 0) + 1);

			// update answer and count
			if (count < mp.get(c)) {
				maxOccured = c;
				count = mp.get(c);
			}
		}
          System.out.println("the max occured character is: "+maxOccured+","+ " and the count: "+count);
		//return 0 or maxOccured;
	}

	public static String removeDuplicatesFromString(String str) {
		StringBuilder strBuilder = new StringBuilder();
		Set<Character> onlyUniqueString = new HashSet<>();
		char[] ch = str.toCharArray();

		for (char c : ch) {
			//if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
				
					if (onlyUniqueString.add(c)) {
						strBuilder.append(c);
			//	}
			}
		}
		return strBuilder.toString();
	}
	
	
}

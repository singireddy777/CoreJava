package com.example.helloworld.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.scheduling.annotation.Scheduled;

//@Component
//@EnableScheduling
public class Test {

	private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, dd/MM/yyyyHH:mm:ss");
	
	public static void main(String[] args) {
		
		int i = 5;

		System.out.println("printing before incremet :" + i++);
		System.out.println("printing after incremet :" + ++i);
		String str = "vensee,.-kadaparthy";
		//("[^a-zA-Z0-9]", " ")
		str = str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("After removing the special characters from the given string: "+str);

		Test t = new Test();
		t.add(5);
		t.printTimeForMe();
		t.myScheduler();
		List<String> theKeysList = t.obtainAllKeys();
		System.out.println("the keys list from the map are: "+theKeysList);
	}

	static {

		int sum = 12;

		for (int i = 0; i <= sum; i++) {
			i++;
			System.out.println("printing from static block: " + i);
			System.out.println(i);
		}
		System.out.println("printing after the static block");
	}

	{

		int sum = 3;

		for (int i = 0; i <= sum; i++) {
			i++;
			System.out.println("printing from instance block: " + i);

		}
		System.out.println("printing after the instance block");
	}

	public void add(int i) {

		int summ = i + 9;

		// return summ;

		System.out.println("The summ is: " + summ);
	}
	@Scheduled(cron = "*/5 * * * *") //this will run every 5 minutes since @Scheduled is available in spring boot itself
	public void myScheduler() {
		
	System.out.println("Testing the spring Scheduler: "+SimpleDateFormat.DAY_OF_WEEK_IN_MONTH_FIELD);	
	}
	
	public void printTimeForMe() {
		
		System.out.println("printing simple date with time in HHMMSS format: "+simpleDateFormat.format(new Date()));
		
	}
	public List<String> obtainAllKeys(){
		
		Map<String,Integer> mapItems = new HashMap<>();
		
		mapItems.put("Vensee", 1);
		mapItems.put("gulabi", 2);
		mapItems.put("kdp", 3);
		mapItems.put("nakrekal", 4);
		mapItems.put("nlg", 5);
		mapItems.put("hyd", 6);
		mapItems.put("btmlayout", 7);
		mapItems.put("etbdept", 8);
		
		
		List<String> keysList = new ArrayList<>();
		List<Integer> valueList = new ArrayList<>();
		
		mapItems.keySet().forEach(key -> keysList.add(key));
		mapItems.forEach((key,value)->valueList.add(value));
//		Set<String> keyset = mapItems.keySet();
//		for(String key:keyset) {
//			keysList.add(key);	
//		}	
		return keysList;
	}	
}

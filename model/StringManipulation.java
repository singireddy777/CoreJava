package com.example.helloworld.model;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "my name is Singireddy Venkat Reddy..!";
		//it will do substring from 5th index onwards starting from 0...
	//	str = str.substring(5);
		System.out.println("printing just substring: " +str);
	//	str = str.substring(1, 7);
		System.out.println("printing between 1 and 7 substring: " +str);
		
		//if(str.contains("ddy")) {
			
			//String replace = str.replace("..",",,,");
			//System.out.println(replace);
		//}
		
			String ticketid = "";
			String almTicketId = "RTCWI-";
			if (almTicketId.contains("-")) {
				String[] id = almTicketId.split("-");
				System.out.println("printing after removing the -");
				System.out.println(ticketid = id[id.length - 1]);
	}
			}
}

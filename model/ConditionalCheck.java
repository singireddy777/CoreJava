package com.example.helloworld.model;

public class ConditionalCheck {
	
public static void main(String[] args) {
 something();
	int x = 10;
	int y = 5;

	if (x > y) {
	    System.out.println("x is greater than y");
	} else if (x < y) {
	    System.out.println("x is less than y");
	} else {
	    System.out.println("x is equal to y");
	}

	int z = 20;

	if (x > y) {
	    if (x > z) {
	        System.out.println("x is the largest");
	    } else {
	        System.out.println("z is the largest");
	    }
	} else {
	    if (y > z) {
	        System.out.println("y is the largest");
	    } else {
	        System.out.println("z is the largest");
	    }
	}
	
}
public static void something() {
	
	String errorMessage;
	String ticketid = "RTCWI-7272";
	String ticketid1 = "RQONE03369281";
	System.out.println("this is inside something method");
	
    if(ticketid!=null && ticketid.startsWith("RQONE")) {
    	System.out.println("this is valid RQONE");
    }
         
    else if(ticketid1.startsWith("RTCWI-"))
   	 System.out.println("this is valid ALM ");
    	errorMessage = "{\"message\":\"Ticket does not belong to RQONE system\"}";
    	
     if(ticketid1.startsWith("RTCWI-"))
    	 System.out.println("this is valid ALM ");
    else
    	errorMessage = "{\"message\":\"Ticket does not belong to ALM system\"}";
     
//     if(!ticketid.startsWith("RTCWI-") && !ticketid.startsWith("RQONE"))
//
//         errorMessage = "{\"message\":\"Ticket does not belong to either ALM or RQONE system\"}";
	
}
}

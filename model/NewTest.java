package com.example.helloworld.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NewTest {

	public static void main(String[] args) {
		String s = new String("venkateshwara swamy");
		String s1 = new String("venkateshwara swamy");
		System.out.println("printing s: "+ s1.equals(s));
		System.out.println("printing s1: "+ s1.hashCode());
		System.out.println("printing s1: "+ s.hashCode());
		
		String s2 = "venkateshwara swamy";
		String s3 = "venkateshwara swamy";
		
		System.out.println("printing s: "+ s.equals(s3));
		System.out.println("printing s: "+ s.hashCode());
		System.out.println("printing s: "+ s3.hashCode());
		
		List ele = new ArrayList();
		ele.add(1);
		ele.add(2);
		ele.add(3);
		ele.add(24);
		//Stream.of())
		
		try {
			int a=10;
			int b=12;
			 int c = a+b;
			 System.out.println(c);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("this is finally block...");
		}
	
	}
	
}

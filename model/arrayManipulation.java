package com.example.helloworld.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class arrayManipulation {

	public static void main(String[] args) {
		
		int[] list = new int[] {5,6,7,1,9,0,2,2,11,23,45,67};
		//output  6,7,1,9,0,2,2,11,23,45,67,5
		//output  7,1,9,0,2,2,11,23,45,67,5,6
		//output  1,9,0,2,2,11,23,45,67,5,6,7
		
		int shift=2;
		int[] rem = new int[shift];
		
//		for(int i=0;i<shift;i++) {
//			rem[i]=list[i];
//		}
//		for(int i=shift;i<list.length;i++) {
//			list[i-shift] = list[i];
//		}
//		
//		int j=0;
//		for(int i=0;i<shift;i++ ) {
//			list[list.length-shift+i] = rem[j];
//			j++;
//		}
//		for(int i : list) {
// 			System.out.print(i+" ");
//		}
		
		
		
		//tc 2
//		System.out.println();
//		double[] arr = new double[] {1.9,2.9,3.9,4.9,5.9,6.9,7.9};
//		
//		Map<Integer,Double> out = new HashMap<>();
//		
//		for(double i : arr) {
//			int key = (int)i;
//			out.put(key, i);
//					
//		}
//		
//		System.out.println(out); 
		
		
		
		//tc 3 : right shift 
		//  5,6,7,1,9,0,2,2,11,23,45,67
		// {5,6,7,1,9,0,2,2,11,23,45,67};
		// 45,67,5,6,7,1,9,0,2,2,11,23
		// 23,24,67,5,6,7,1,9,0,2,2,11
		
		//shift=2;
		//int[] rem = new int[shift];
		
		for(int i=0;i<shift;i++) {
			rem[i]=list[list.length-shift+i];
			
		}
		int[] trim = new int[list.length-shift];
		int j=0;
		for(int i=shift;i<list.length;i++) {
			trim[j]=list[i];
			j++;
		}

		
		for(int i : trim) {
 			System.out.print(i+" ");
		}
		
		System.out.println();
		for(int i=0;i<shift;i++ ) {
			trim[i] = rem[i];
			
		}
		
		for(int i : trim) {
 			System.out.print(i+" ");
		}
		
//		for(int i=0;i<list.length;i++) {
//			for(int j=0;j<list.length-1;j++) {
//				if(list[j]<list[j+1]) { 
//					int t = list[j];
//					list[j]=list[j+1];
//					list[j+1]=t;
//				}
//			}
//		}
		
		
		
		
	}
}
  
package com.example.helloworld.model;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Find pair of numbers from given array using Streams API. { 8, //7, 2, 5, 3, 3 }
//output should be 3  if 8 added to the list 8,3
import java.util.*;
import java.util.stream.Collectors;
public class ABD {
    public static void main(String[] args) {
        findPairsFromArray();
        System.out.println("Hello, World!");
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(8,8,7,2,5,3,3));
        List<Integer> pairNumbers = new ArrayList<>();
       for(int i=0;i<=numbersList.size();i++){
           for(int j=i+1;j<=numbersList.size()-1;j++){
               
            if(numbersList.get(i)==numbersList.get(j)){
                pairNumbers.add(numbersList.get(i));
            }   
           }
       }
        System.out.println("the pair numbers are: "+pairNumbers);
    }
    public static void findPairsFromArray() {
    	
    	        List<Integer> numbersList = Arrays.asList(8, 8, 7, 2, 4,4,5, 3, 3);
    	        
    	        List<Integer> pairNumbers = numbersList.stream()
    	            .distinct() // Remove duplicates
    	            .filter(num -> numbersList.indexOf(num) != numbersList.lastIndexOf(num)) // Find duplicates
    	            .collect(Collectors.toList());
    	        
    	        System.out.println("The pair numbers are1: " + pairNumbers);
    	    }
  
}
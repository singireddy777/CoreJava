package com.example.helloworld.model;

public class SumOfGivenNumberJava8 {
	
	public static void main(String[] args) {
		int result = calculateSumOfDigits(12345);
		System.out.println("the result: "+result);
	}
	
	public static int calculateSumOfDigits(int number) {
        
		return String.valueOf(number)
            .chars()
            .map(Character::getNumericValue)
            .reduce(0, (a, b) -> a + b);
    }
}

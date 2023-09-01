package com.example.helloworld.model;

import java.util.Set;

public class FibonacciSeriesGen {
	public static void main(String[] args) {
		createFibonacciSeries();
		isArmstrongNumber(371);
		addSumOfDigits(1234);
	}

	public static void createFibonacciSeries() {

		int n = 14, firstNumebr = 0, secondNumber = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");

		// Fibonacci series means: n= (n-1)+(n-2)

		for (int i = 1; i <= n; ++i) {
			int nextNumber = firstNumebr + secondNumber;
			firstNumebr = secondNumber;
			secondNumber = nextNumber;
			System.out.print(firstNumebr + ", ");
			
		}
	}

	public static void isArmstrongNumber(int number) {

		int originalNumber = number, remainder, result = 0;

		while (originalNumber != 0) {       //371 = 3^3+7^3+1^3
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}
		if (result == number) {
			// return true;
			System.out.println("yes its armstrong numebr");
		} else
			// return false;
			System.out.println("no its not armstrong numebr");
	}

	public static int addSumOfDigits(int givenNumber) {

		int sum = 0;
		while (givenNumber != 0) {
			sum = sum+givenNumber%10;
			givenNumber = givenNumber / 10;
		}
		System.out.println("the sum of given number is: " + sum);
		return sum;
	}

}

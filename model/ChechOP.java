package com.example.helloworld.model;

public class ChechOP {

	public static void main(String[] args) {
		int a =10,b=20, c=5;
		
		c+= ++a + b--;
		
		System.out.println("after the operation, values are: "+"a="+ a +" b=" +b+"c="+c+"");
		addTwo();
			
		}
	public static int addTwo() {
		int a =1,b=2,c=3;
		int a1 =a+b+c;
		System.out.println("simply static ..."+a1);
		return a1;
	}
}

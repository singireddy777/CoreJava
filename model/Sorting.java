package com.example.helloworld.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	
public static void main(String[] args) {
	
List<Employee> empList = new ArrayList<Employee>();
	
	empList.add(new Employee("vensee", 200));
	empList.add(new Employee("ramu", 300));
	empList.add(new Employee("gouthi", 400));
	empList.add(new Employee("lucky", 200));
	empList.add(new Employee("vensee1", 490));
	empList.add(new Employee("ramu1", 500));
	empList.add(new Employee("gouthi1", 600));
	empList.add(new Employee("lucky5", 700));
   //this is to get the list of employees who have salary more than 200
	List<Employee> employeesList = empList.stream().filter(x->x.getSalary()>200).collect(Collectors.toList());
	for(Employee emp:employeesList) {
		System.out.println("The final details: "+emp.getEmpName()+" "+emp.getSalary());
	}
	obtainObjects("venkatreddy");
	int a[] = {20,10,5,5,5,1};  
	int temp;
	
	for (int i=0;i<a.length;i++) {
		
		  for(int j=i+1;j<a.length;j++) {
			  if(a[i]<a[j]) {
				  
				  temp=a[i];//
				  a[i]=a[j];
				  a[j]=temp;
				  
			  }
			  
			  for(int k=0;k<a.length;k++) {
					System.out.print(a[k]+" ");
			  }
			  System.out.println();
		  }
		  
		  System.out.println();
		  
	}
	
	
	
	/*
	 * for i=0:10,20,5,6,1
	 * 	j=1:10,20,5,6,1
	 * 	j=2:5,20,10,6,1
	 * 	j=3:1,20,10,6,5
	 *  
	 * 
	 */
	
}
public static String obtainObjects(String input) {
	
	//String s= new String("SINGIREDDY");
	String s2 = "SINGIREDDY";
	
	char s1=input.charAt(5);//in string index starts from 0
	
	if(s1=='t') {
		s2.toLowerCase().equalsIgnoreCase(s2);
		System.out.println("the lower case is: "+s2);
	}
	System.out.println("the character at 5th index is: "+s1);
	
	return null;
}
}

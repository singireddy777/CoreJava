package com.example.helloworld.model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class DriverJava8 {
	
	public static void main(String[] args) {
		Map<EmployeeJava8,Long> empMap = new HashMap<>();
		empMap.put(new EmployeeJava8(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0), null);
		
		List<EmployeeJava8> employeeList = new ArrayList<EmployeeJava8>();    
		employeeList.add(new EmployeeJava8(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new EmployeeJava8(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new EmployeeJava8(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new EmployeeJava8(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new EmployeeJava8(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new EmployeeJava8(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new EmployeeJava8(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new EmployeeJava8(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new EmployeeJava8(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new EmployeeJava8(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new EmployeeJava8(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new EmployeeJava8(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new EmployeeJava8(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new EmployeeJava8(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new EmployeeJava8(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new EmployeeJava8(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new EmployeeJava8(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));	
	
		 List<EmployeeJava8> afterAdding20Ksalary = employeeList.stream()
				 .filter(employee->employee.getSalary()>30000).peek(employee ->employee.setSalary(employee.getSalary()+20000)).collect(Collectors.toList());
		 Collections.sort(employeeList, Comparator.comparing(EmployeeJava8::getSalary)
				 .thenComparing(Comparator.comparing(EmployeeJava8::getYearOfJoining)));
		 for(EmployeeJava8 emp:employeeList) {
			 System.out.println("Employee details after sorting based on salary and date of joining: "+emp);
		 }
		 //sorting based on employee salary and employee id
		 List<EmployeeJava8> sortedEmployeeList = employeeList.stream().sorted(Comparator.comparing(EmployeeJava8::getSalary).thenComparing(Comparator.comparing(EmployeeJava8::getEmpId))).collect(Collectors.toList());
		 for(EmployeeJava8 emp: sortedEmployeeList) {
			 
		 }
		 
		 System.out.println("after sorting the elements based on salary and emloyee id: "+sortedEmployeeList);
		System.out.println("after adding 20k rupees to the employee whose salary is greater than 30k: "+ afterAdding20Ksalary);
		 //1.How many male and female employees are there in the organization?
		Map<String, Long> maleFemaleCount = 
				employeeList.stream().collect(Collectors.groupingBy(EmployeeJava8::getGender,Collectors.counting()));
		System.out.println("printing male and female count in the organization: "+maleFemaleCount);
		
		
		//2.Print the name of all departments in the organization
		// List<String> depts = employeeList.stream().map(EmployeeJava8::getDepartment).distinct().collect(Collectors.toList());
		 employeeList.stream().map(EmployeeJava8::getDepartment).distinct().forEach(System.out::println);
		// depts.stream().forEach(System.out::println);
		 
		 //3. What is the average age of male and female employees?
		 Map<String, Double> averageAgeOfMaleAndFemaleEmployees = employeeList.stream().collect(Collectors.
				 groupingBy(EmployeeJava8::getGender, Collectors.averagingInt(EmployeeJava8::getEmpAge)));
		 System.out.println("The Average age of Employees: "+averageAgeOfMaleAndFemaleEmployees);
		 
		 //4.Get the details of highest paid employee in the organization?
		 Optional<EmployeeJava8> highestPaidEmployee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(EmployeeJava8::getSalary)));
		 System.out.println("The highest salary paid employee is: "+highestPaidEmployee);
		 EmployeeJava8 emp = highestPaidEmployee.get();
		 String dept = emp.getDepartment();
		 System.out.println("just printing the dept: "+dept.toString());
		 
		 //5.Get the names of all employees who have joined after 2015?
		 
		 List<String> names = employeeList.stream().filter(e->e.getYearOfJoining()>2015)
				 .map(EmployeeJava8::getEmpName).collect(Collectors.toList());
		 System.out.println("the employees joined after 2015: "+names);
		 names.stream().forEach(System.out::println);
		 
		 //6.Count the number of employees in each department?
		 
		 Map<String, Long> noOfEmpsInEachDept = employeeList.stream()
				           .collect(Collectors.groupingBy(EmployeeJava8::getDepartment,Collectors.counting()));
	
             	Set<Entry<String,Long>> empEntrySet = noOfEmpsInEachDept.entrySet();
             	for(Entry<String,Long> entry:empEntrySet) {
             		System.out.println(entry.getKey()+" "+entry.getValue());
             	}
	
             	//7.What is the average salary of each department?
             	
             	Map<String,Double> avgSalaryPerDept = employeeList.stream().collect(Collectors.
             			groupingBy(EmployeeJava8::getDepartment, Collectors.averagingDouble(EmployeeJava8::getSalary)));
             	System.out.println("the average salary for every dept: "+avgSalaryPerDept);
             	Set<Entry<String,Double>> someDoubleEntry = avgSalaryPerDept.entrySet();
             	for(Entry<String, Double> someDouble:someDoubleEntry) {
             		System.out.println("now printing individual avg sal: "+someDouble);
             	}
             	
             	//8.Get the details of youngest male employee in the product development department?
             	Optional<EmployeeJava8> ymeipdd = employeeList.stream()
             			.filter(e->e.getGender()=="Male" && e.getDepartment()=="Product Development").min(Comparator.comparingInt(EmployeeJava8::getEmpAge));
             	EmployeeJava8 empl =ymeipdd.get();
             	System.out.println("the youngest male employee in prod dev dept: "+empl);
             	List<Double> numbers = List.of(2.5, 3.8, 1.7, 4.2, 2.0);
                //double average = calculateAverage(numbers);
                //System.out.println("Average: " + average);
             	
             	//9.Who has the most working experience in the organization?
             	Optional<EmployeeJava8> mostWorkExp = employeeList.stream().sorted(Comparator.comparingInt(EmployeeJava8::getYearOfJoining)).findFirst();
             	System.out.println("The most experienced employee: "+mostWorkExp);
             	
             	//10.How many male and female employees are there in the sales and marketing team?
             	Map<String, Long> maleAndFemaleInMarketing  = employeeList.stream()
             			.filter(e->e.getDepartment( )== "Sales And Marketing").collect(Collectors.groupingBy(EmployeeJava8::getGender,Collectors.counting()));
             	System.out.println("Male and female count in the marketing dept: "+maleAndFemaleInMarketing);
             	
             	//11.What is the average salary of male and female employees?
             	
             	Map<String,Double> avgSalOfMaleAndFemale = employeeList.stream().collect
             			(Collectors.groupingBy(EmployeeJava8::getGender,Collectors.averagingDouble(EmployeeJava8::getSalary)));
             	System.out.println("The average salary of male and female are: "+avgSalOfMaleAndFemale);
             	
	
	
	}
	
	public static double calculateAverage(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty");
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }
}

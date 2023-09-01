package com.example.helloworld.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class EmployeeJava8 {
	
	private int empId;
	private String empName;
	private int empAge;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;
	
//	public EmployeeJava8(int empId, String empName, int empAge, String gender, String department, int yearOfJoining,
//			double salary) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.empAge = empAge;
//		this.gender = gender;
//		this.department = department;
//		this.yearOfJoining = yearOfJoining;
//		this.salary = salary;
//	}
//	public int getEmpId() {
//		return empId;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//	public String getEmpName() {
//		return empName;
//	}
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	public int getEmpAge() {
//		return empAge;
//	}
//	public void setEmpAge(int empAge) {
//		this.empAge = empAge;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public String getDepartment() {
//		return department;
//	}
//	public void setDepartment(String department) {
//		this.department = department;
//	}
//	public int getYearOfJoining() {
//		return yearOfJoining;
//	}
//	public void setYearOfJoining(int yearOfJoining) {
//		this.yearOfJoining = yearOfJoining;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	@Override
//	public String toString() {
//		return "EmployeeJava8 [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", gender=" + gender
//				+ ", department=" + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
//	}
	
	
}

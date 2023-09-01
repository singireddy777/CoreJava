package com.example.helloworld.model;

import java.util.ArrayList;
import java.util.List;

public class StudentsList {
	
	private List<StudentsList> studentsList = new ArrayList<>();

//	public StudentsList(List<StudentsList> studentsList) {
//		//super();
//		this.studentsList = studentsList;
//	}

	public List<StudentsList> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(List<StudentsList> studentsList) {
		this.studentsList = studentsList;
	}

}

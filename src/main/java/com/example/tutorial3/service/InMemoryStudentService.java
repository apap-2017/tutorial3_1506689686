package com.example.tutorial3.service;

import java.util.List;
import java.util.ArrayList;
import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService{
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();

	@Override
	public StudentModel selectStudent(String npm) {
		// TODO Auto-generated method stub
		for (StudentModel student : studentList) {
			if(student.getNpm().equals(npm))
				return student;
		}
		return null;
	}
	

	@Override
	public List<StudentModel> selectAllStudents() {
		// TODO Auto-generated method stub
		return studentList;
	}

	@Override
	public void addStudent(StudentModel student) {
		// TODO Auto-generated method stub
		studentList.add(student);
	}
	
	public void deleteStudent(String npm) {
		// TODO Auto-generated method stub
		//		studentList.remove(student);
		int counter = 0;
		for (StudentModel student : studentList) {
			if(student.getNpm().equals(npm)) {
				studentList.remove(counter);
				break;
			}
			counter++;
				
		}
	
	}
	
	
	
	
}

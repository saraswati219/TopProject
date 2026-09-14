package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.Student;
@Service
public interface StudentServiceI {
	//create 
	public Student addStudentData(Student stu);
	
	//retrieve
	public List<Student> getAll();
	
	//Update
	public Student updateStudent(Student stu);
	
	//Delete
	public List<Student> deleteStudentData(int id);
	
	public Student getSingleStudent(int rn);
	
	public List<Student> getStudent(String name);
	
	public Student loginCheck(String un,String ps);
	
	public List<Student> deleteStudentByname(String name);
	
	public List<Student> checkStudentMark(float mark);
	
	public List<Student> getAllData();
	
	//sortbymark
	public List<Student> sortByStudentMark();
	
	//between mark
	public List<Student> betweenByStudentMark();
	
	

}

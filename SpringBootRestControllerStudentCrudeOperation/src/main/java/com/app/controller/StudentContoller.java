package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.StudentServiceI;

@RestController
public class StudentContoller {
	@Autowired
	private StudentServiceI ssi;
	
	@PostMapping("/student")
	public Student createStudentData(@RequestBody Student stu) {
		Student stud = ssi.addStudentData(stu);
		return stud;
	}
	
	@GetMapping("/get")
	public List<Student> getAllStudent(){
		//List<Student> all = ssi.getAll();
		List<Student> all = ssi.getAllData();
		return all;
		
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student stu) {
		Student stud = ssi.updateStudent(stu);
		return stud;
	}
	
	@DeleteMapping("delete/{id}")
	public List<Student> deleteStudent(@PathVariable("id") int rollno){
		List<Student> data = ssi.deleteStudentData(rollno);
		return data;
	}
	
	@GetMapping("/single/{id}")
	public Student getStudent(@PathVariable("id") int rn) {
		Student stud = ssi.getSingleStudent(rn);
		return stud;
		
	}
	
	@GetMapping("/stud/{name}")
	public List<Student> getStudentByname(@PathVariable("name") String name){
		List<Student> list = ssi.getStudent(name);
		return list;
	}
	
	@GetMapping("/login/{username}/{password}")
	public Student loginCheck(@PathVariable("username") String un,@PathVariable("password") String ps) {
		Student stud = ssi.loginCheck(un, ps);
		return stud;
	}
	
	@DeleteMapping("delbyname/{name}")
	public List<Student> deleteStudent(@PathVariable("name") String name){
		List<Student> list = ssi.deleteStudentByname(name);
		return list;
	}
	
	@GetMapping("checkbymark/{mark}")
	public List<Student> getStudentMark(@PathVariable("mark") float mark){
		List<Student> list = ssi.checkStudentMark(mark);
		return list;
	}
	
	@GetMapping("sortbymark")
	public List<Student> sortByStudentMark(){
		List<Student> list = ssi.sortByStudentMark();
		return list;
	}
	
	@GetMapping("betbymark")
	public List<Student> betweenStudentMark(){
		List<Student> list = ssi.betweenByStudentMark();
		return list;
	}
	
	

}

package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentReposistoryI;
@Service
public class StudentService implements StudentServiceI{
	@Autowired
	private StudentReposistoryI sri;

	@Override
	public Student addStudentData(Student stu) {
		Student add = sri.save(stu);
		
		return add;
	}

	@Override
	public List<Student> getAll() {
		List<Student> list =(List<Student>) sri.findAll();
		return list;
	}

	@Override
	public Student updateStudent(Student stu) {
		Student stud = sri.save(stu);
		return stud;
	}

	@Override
	public List<Student> deleteStudentData(int id) {
		 sri.deleteById(id);
		List<Student> list = (List<Student>) sri.findAll();
		return list;
	}

	@Override
	public Student getSingleStudent(int rn) {
		
		//Optional op = sri.findById(rn);
		
		//if(op.isPresent())
		//{
			//Student stud = (Student) op.get();
			//return stud;
		//}
		//return null;
		
	//for query	
	Student stud = sri.getByRollno(rn);
	return stud;
	}
		

	@Override
	public List<Student> getStudent(String name) {
		List<Student> list = sri.findByName(name);
		
		return list;
	}

	@Override
	public Student loginCheck(String un, String ps) {
		Student stud = sri.findByUsernameAndPassword(un, ps);
		return stud;
	}

	@Override
	public List<Student> deleteStudentByname(String name) {
		sri.deleteByName(name);
		return (List<Student>) sri.findAll();
	}

	@Override
	public List<Student> checkStudentMark(float mark) {
		List<Student> marks = sri.findByMark(mark);
		
		return marks;
	}

	@Override
	public List<Student> getAllData() {
		List<Student> all = sri.getAllData();
		return all;
	}

	@Override
	public List<Student> sortByStudentMark() {
		List<Student> marks = sri.sortByMark();
		return marks;
	}

	@Override
	public List<Student> betweenByStudentMark() {
		List<Student> mark = sri.betStudentMark();
		return mark;
	}
	
	

}

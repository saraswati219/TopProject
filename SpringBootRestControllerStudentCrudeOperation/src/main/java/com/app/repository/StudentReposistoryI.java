package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.model.Student;

import jakarta.transaction.Transactional;
@Repository
//public interface StudentReposistoryI extends //CrudRepository<Student,Integer> {

public interface StudentReposistoryI extends JpaRepository<Student,Integer>{
	
	
	
	public List<Student> findByName(String name);
	
	public Student findByUsernameAndPassword(String un,String ps);
	
	@Transactional
	@Modifying
	public void deleteByName(String name);
	
	public List<Student> findByMark(float mark);
	
	@Query("from Student")
	public List<Student> getAllData();
	
	@Query("from Student where rollno=:rn")
	public Student getByRollno(@Param("rn") int rn);
	
	@Query("from Student where name=:name")
	public Student getByName(@Param("name") String name);
	
	//sortbymarkAscending order
	@Query("from Student Order by mark asc")
	public List<Student> sortByMark();
	
	//between mark
	@Query("from Student where mark between 50 and 70")
	public List<Student> betStudentMark();
	
	

	
	

	

}

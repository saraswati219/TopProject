package com.app.service;

import java.util.List;

import com.app.model.Person;

public interface HomeServiceI {
	public void getData(Person p);
	
	public List<Person> getAllData();

}

package com.app.respository;

import java.util.List;

import com.app.model.Person;

public interface HomeRepositoryI {
	public void getData(Person p);
	public List<Person> getAllData();

}

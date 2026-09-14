package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Person;
import com.app.respository.HomeRepository;

@Service
public class HomeService implements HomeServiceI{
	@Autowired
	private HomeRepository hri;

	@Override
	public void getData(Person p) {
		System.out.println("In Service"+p);
		hri.getData(p);		
	}

	@Override
	public List<Person> getAllData() {
		
		List<Person> allData = hri.getAllData();
		return allData;
	}

	
}

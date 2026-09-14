package com.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Address;
import com.app.model.Person;
import com.app.service.HomeService;

@RestController
public class HomeController {
	@Autowired
	private HomeService hs;
	@PostMapping("/save")
	public Person getPerson(@RequestBody Person p) {
		System.out.println(p);
		hs.getData(p);
		
		return p;
		
	}

	//getAllData
	@GetMapping("/return")
	public List<Person> getData() {
	List<Person> list	= hs.getAllData();
		return list ;
		
	}
}

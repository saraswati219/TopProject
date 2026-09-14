package com.app.respository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.model.Person;
@Repository
public class HomeRepository implements HomeRepositoryI{
	List<Person> list = new ArrayList<>();

	@Override
	public void getData(Person p) {
		list.add(p);
		System.out.println("In repository"+p);
		for(Person per :list) {
			System.out.println(per);
		}
		
	}
	@Override
	public List<Person> getAllData(){
		return list;
		
	}

}

package com.app.model;

public class Person {
	private int id;
	private String name;
	private Address adr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", adr=" + adr + "]";
	}
	
	
	

}

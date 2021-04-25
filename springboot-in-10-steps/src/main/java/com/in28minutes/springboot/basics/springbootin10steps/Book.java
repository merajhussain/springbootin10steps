package com.in28minutes.springboot.basics.springbootin10steps;

public class Book {
	
	long id;
	String name;
	String athor;
	
	public Book(long id, String name, String athor) {
		super();
		this.id = id;
		this.name = name;
		this.athor = athor;
	}

	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAthor() {
		return athor;
	}

	
	
}

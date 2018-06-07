package com.mkyong.core;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	
	@Autowired
	private Person person;
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + person.getName() + "]";
	}

}

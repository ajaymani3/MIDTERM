package com.cisc181.core;

public class PersonException extends Exception {
	
	private Person PERSON;
	
	public PersonException(Person Person){
		this.PERSON = Person;
	}
	
	public Person getPerson(){
		return this.PERSON;
	}
	
}

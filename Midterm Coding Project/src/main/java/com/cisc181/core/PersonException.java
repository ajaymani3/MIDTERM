package com.cisc181.core;

public class PersonException extends Exception {
	
	private Person PERSON;
	
	public PersonException(Person person){
		this.PERSON = person;
	}
	
	public Person getPerson(){
		return this.PERSON;
	}
	
}

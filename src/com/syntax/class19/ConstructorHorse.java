package com.syntax.class19;

public class ConstructorHorse {//Fields is the same as instance variables
	//Fields
	private String name;
	private int age;
	private double weight;
	
	
	//purpose of constructor is to give initial value to the fields of a class
	ConstructorHorse(String horseName, int horseAge, double horseWeight){
		name=horseName;
		age=horseAge;
		weight=horseWeight;
		
	}
	void printHorseName() {
		System.out.println("Name "+name);
	}
	void setName(String horseName) {
		name=horseName;
	}
	

}

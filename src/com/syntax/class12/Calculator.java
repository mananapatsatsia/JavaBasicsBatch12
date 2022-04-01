package com.syntax.class12;

public class Calculator {
	//Defined method
	void addNumbers(int number1, int number2) {
		System.out.println(number1+number2);
	}
	//Undefined method
	void add() {
		int number1=10;
		int number2=20;
		System.out.println(number1+number2);
	}
   void person(String greeting, String name ) {
	   System.out.println(greeting+name);
   }
}

package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
		int num1=100;
		int num2=50;
		
		if(num1>num2) {
			System.out.println(num1+ " is larger than "+ num2);
		}else {
			System.out.println(num2+" is larger than "+num2);
		}
		
		int temp=45;
		
		//if(temp>=45)
		if(temp>45) {
			System.out.println("I am going for a walk");
		}else {
			System.out.println("I am staying at home.");
		}
		//char gender='m';
		char gender='f';
		if(gender=='f') {
			System.out.println("please use front of the train");
		}else {
			System.out.println("please use back of the train");
		}

	}

}

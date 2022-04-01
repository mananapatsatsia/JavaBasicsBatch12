package com.syntax.class06;

import java.util.Scanner;

public class CalculatorIfElse {

	public static void main(String[] args) {
		
		double num1=0;
		double num2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 1st number:");
		 num1=sc.nextDouble();
		
		System.out.println("Please enter 2nd number:");
		 num2=sc.nextDouble();
		
		System.out.println("Please enter any operator: +,-, *, /.");
		char operator=sc.next().charAt(0);
		
		double result;
		if(operator=='+') {
			result=num1+num2;
			System.out.println(result);
		}else if(operator=='-') {
			result=num1-num2;
			System.out.println(result);
		}else if(operator=='*') {
			result=num1*num2;
			System.out.println(result);
		}else if(operator=='/') {
			result=num1/num2;
			System.out.println(result);
		}else {
			System.out.println("Wrong operator");

	}
		
	}

}

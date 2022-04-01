package com.syntax.class06;

import java.util.Scanner;

public class CalculatorSwitch {
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 1st number:");
		double num1=sc.nextDouble();
		
		System.out.println("Please enter the 2nd number:");
		double num2=sc.nextDouble();
		
		System.out.println("Please enter eny operator: +, -, *, /.");
		char operator=sc.next().charAt(0);
		
		double result;
		switch (operator) {
			case ('+'):
				result=num1+num2;
			break;
			case ('-'):
				result=num1-num2;
			break;
			case ('*'):
				result=num1*num2;
			break;
			case ('/'):
				result=num1/num2;
			break;
			default:
				result=0;
		}
			
		System.out.println(num1+" "+operator+" "+num2+"="+result);
	
		    
	}

}

package com.syntax.class13;

import java.util.Scanner;

public class MethodHW2 {
	/*Create a method that will take a number 
	 * and prints whether the number is even or odd. 
	 */
	String input( int number1) {
		if(number1%2==0) {
			return number1 +"- number is even";
		}else {
			return number1+"- number is odd";
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int number1=sc.nextInt();
		MethodHW2 number=new MethodHW2();
		
		System.out.println(number.input(number1));
	

	}

}

package com.syntax.class04;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How much loan amount you will need?");
		int loan=scan.nextInt();
		
		
		
		if(loan<=200000) {
			System.out.println("You will get a loan for this amount of money");
		}else {
			System.out.println("You are not eligible for the loan");
		}
		System.out.println();
	
		System.out.println("===AselNote===");
		/*
		 * Write a program to check whether number is positive or negative.
		 */
		int num = 0;
		if (num < 0) {
		System.out.println("The number " + num + " is Negative");
		} else if (num > 0) {
		System.out.println("The number " + num + " is Positive");
		} else {
		System.out.println("The number is " + num);
		}
		/*
		 * Write a Java Program to check whether number is Even or Odd.
		 */
		num = 10;
		if (num % 2 == 0) {
		System.out.println("This " + num + " is an even Number");
		} else {
		System.out.println("The " + num + " is an Odd Number");
		}
		
	}

}

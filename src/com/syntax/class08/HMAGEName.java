package com.syntax.class08;

import java.util.Scanner;

public class HMAGEName {

	public static void main(String[] args) {
		/*
		 * Ask a user to enter name, last name and age 5 times.
		Every time your program
		 * should print those values in a format 
		 */
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<=5; i++) {
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		System.out.println("Please enter your last name: ");
		String lname = scan.nextLine();
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Your name is " + name + " "+lname+ " and you are " + age + " years old.");
		}
		}
		}
	



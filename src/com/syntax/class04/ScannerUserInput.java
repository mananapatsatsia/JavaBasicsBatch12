package com.syntax.class04;

import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  System.out.println("Please,enter your name");
	   String name=input.next();
	   System.out.println("My name is "+name);
	   System.out.println("And what is your last name?");
	   String lastName=input.next();
       System.out.println("My last name is "+lastName);
       System.out.println("How old are you?");
       int age=input.nextInt();
       System.out.println("You are "+ age+" years old");
       
       System.out.println("Do you want became SDET?");
       String answer=input.next();
       System.out.println("I want to be profesional");
	}

}

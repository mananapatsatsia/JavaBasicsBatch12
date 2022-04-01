package com.Repl;

import java.util.Scanner;

public class Repl32Copy {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);

	       System.out.println("Please enter your gender:");
	       String gender=sc.next();
	      
	      System.out.println("Please enter your age");
	      int age=sc.nextInt();

	      if(age<25 && gender.equalsIgnoreCase("M"))
	        System.out.println("BOY");
	        else if(age<25 && gender.equalsIgnoreCase("F")){
	        System.out.println("Girl");}
	        if(age>25 && gender.equalsIgnoreCase("F")){
	        System.out.println("Woman");}
	        else if(age>25 && gender.equalsIgnoreCase("M") ) {

	        System.out.println("Man");

	      
	      
	      }

	}

}

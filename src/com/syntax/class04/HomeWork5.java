package com.syntax.class04;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		Scanner gh=new Scanner(System.in);
		System.out.println("How many years have you been worked?");
		int years=gh.nextInt();
		System.out.println("And what is your anual salary?");
		int salary=gh.nextInt();
		if(years>=5) { 
			System.out.println("You are eligible for the bonus");
		     if(salary>50000) {
		    	 System.out.println("Your bonus is 5000");
		     }else if(salary<50000) {
		    	 System.out.println("Your bonus is 3000");
		     }
		
		} else {
			System.out.println("Unfortunately,you are not eligible for the bonus.");
		}
		     
	}
	

}

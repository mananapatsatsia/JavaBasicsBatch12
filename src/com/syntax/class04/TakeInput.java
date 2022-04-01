package com.syntax.class04;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		//1. create a Scanner and assign to a variable
		Scanner scan=new Scanner(System.in);
		//2. specify instructions
		System.out.println("Please enter country where you are from");
		//3 we need to capture String value --> use next();
		String country=scan.next();
		System.out.println("You are from "+country);
		//if you are from USA --> you speak english 
//		     if you are from France --> you speak french
		if(country.equalsIgnoreCase("USA")) {
		System.out.println("You speak english");
		}else if(country.equalsIgnoreCase("France")) {
		System.out.println("You speak french");
		} else if (country.equalsIgnoreCase("Turkey")) {
		System.out.println("You speak turkish");
		} else {
		System.out.println("I do not know which language you speak");
		}
		}
		

	}



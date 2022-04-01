package com.syntax.class03;

public class MoreExamples {

	public static void main(String[] args) {
		/*
		 * we need to declare a boolean variable hungry yes or no
		 * 
		 * if we are hungry --> i am going to eat
		 * otherwise --> I am going to drink a tea
		 */
		boolean hungry=false;
		if(hungry) {
		System.out.println("I am going to eat");
		}else {
		System.out.println("I am going to drink a tea");
		}
		boolean traffic=true;
		if(traffic) {
		System.out.println("I am coming home late");
		}else {
		System.out.println("No traffic, I am on time");
		}
		/* define a variable to store a browser
		 * 
		 * if browser is chrome --> we are executing tests on chrome
		 * otherwise --> i am not executing any test cases
		 */
		String browser="Chrome";
		//always use equals to compare 2 strings
		if (browser.equals("chrome")) { 
		System.out.println("we are executing tests on chrome");
		}else {
		System.out.println("We are not executing any test cases");
		}
		//would work in this example but not prefferable
		if (browser=="chrome") { 
		System.out.println("we are executing tests on chrome");
		}else {
		System.out.println("We are not executing any test cases");
		}
		/*
		 * if (browser) { }//ERROR: Type mismatch: cannot convert from String 
		to boolean
		 */
		}
		

	}



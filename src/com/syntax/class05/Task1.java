package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What is today day?");
		
		
		String day="Sunday";
		day=sc.nextLine();
		if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")) {
			System.out.println("There is no class today");
		}else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")){
			System.out.println("Manual");
		}else if(day.equals("Thursday")) {
			System.out.println("Review class");
		}else if(day.equalsIgnoreCase("Saturday")|| day.equalsIgnoreCase("Sunday")) {
			System.out.println("Java class");
		}
		else {System.out.println("Back to real life");}
	}

}

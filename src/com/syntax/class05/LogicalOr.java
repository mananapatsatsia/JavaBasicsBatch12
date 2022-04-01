package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		String day="Saturday";
		if(day.equals("Saturday") || day.equals("Sunday")) {
		System.out.println("I have java class");
		}
		System.out.println("Code outside of if statement");
		/* let's ask user what is today day
		 * 
		 * based on the day lets define which class we have
		 * 
		 * if (monday or friday) --> there is no class today
		 * else if (tuesday or wednesday) --> manual
		 * else if (thursday) --> review class
		 * else if (saturday or sunday) --> java class
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a weekday");
		day = scan.nextLine();
		if (day.equalsIgnoreCase("Monday") || day.equals("Friday")) {
		System.out.println("There is no class");
		} else if (day.equalsIgnoreCase("Tuesday") || day.equals("Wednesday")) 
		{
		System.out.println("There is manual testing class");
		} else if (day.equalsIgnoreCase("Thursday")) {
		System.out.println("There is review class");
		} else if (day.equalsIgnoreCase("Saturday") || day.equals("Sunday")) {
		System.out.println("There is Java programming class");
		}else {
		System.out.println("INVALID ENTRY");
		}
		}
	}



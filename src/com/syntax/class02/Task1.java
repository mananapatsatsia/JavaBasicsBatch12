package com.syntax.class02;

public class Task1 {

	public static void main(String[] args) {

		/*-Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		Your program should say. 
		“The _______ of 2 numbers ___ and ___ is equal to _____”
		  -Write a program to find the square of the number 3.9. 
		  You program should say “The square of the ____ is ____ ”
		  - Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
		   Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
		*/
		// task1
		double d1 = 1.5;
		double d2 = 7.6;

		double add = d1 + d2;
		double sub = d1 - d2;
		double mult = d1 * d2;
		double div = d1 / d2;

		// task2
		double n = 3.9;
		double square = n * n;
		// task3
		int width = 5;
		int height = 8;
		int area = width * height;
		int perimeter = 2 * (width + height);
		System.out.println("The addition of 2 numbers " + d1 + " and " + d2 + " is equal to " + add + ";");
		System.out.println("The substraction of 2 numbers " + d1 + " and " + d2 + " is equal to " + sub + ";");
		System.out.println("The multiplication of 2 numbers " + d1 + " and " + d2 + " is equal to " + mult + ";");
		System.out.println("The division of 2 numbers " + d1 + " and " + d2 + " is equal to " + div + ";");
		System.out.println("------------------------------------------");
		System.out.println("The square of the " + n + " is " + square + ";");
		System.out.println("------------------------------------------");
		System.out.println("The perimeter of rectangl with width " + width + " and height " + height + " is equal to "
				+ perimeter + ";");
		System.out.println("------------------------------------------");
		System.out.println(
				"The area of rectangl with width " + width + " and height " + height + " is equal to " + area + ";");

	}

}

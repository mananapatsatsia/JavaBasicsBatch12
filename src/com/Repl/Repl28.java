package com.Repl;

import java.util.Scanner;

public class Repl28 {

	public static void main(String[] args) {
		/*
		 * Write a program to take values of length and width from the user.
		 * 
		 * Based on value define whether the shape is a square or rectangle.
		 * 
		 * Examples:
		 * 
		 * ``` Please enter the length 18 Please enter the width 16 The shape of your
		 * object is rectangle ```
		 * 
		 * ``` Please enter the length 16 Please enter the width 16 The shape of your
		 * object is square
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the length");
		double length=sc.nextDouble();
		System.out.println("Please enter the the width");
		double width=sc.nextDouble();
		if(length>width) {
			System.out.println("The shape of your object is rectangle");
		}else if(length==width) {
			System.out.println("The shape of your object is square");
		    
		}

	}

}

package com.syntax.class04;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please, enter your city");
		String city=sc.next();
		System.out.println("Please enter current temperature in Farenheits in your city");
		int temF=sc.nextInt();
		int temC=(temF-32)*5/9;
		System.out.println("The temperature in  "+city+" is "+temC+" Celsius.");
		
	}

}

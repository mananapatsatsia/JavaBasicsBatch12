package com.syntax.class13;

import java.util.Scanner;

public class MethodHW5 {
	//Write a method to return whether given number is prime or not?
	String prime(int num) {
	if(num%2!=0 && num>1) {
		return num+ " is prime number";
	}else {
		return num+ " is not prime number";
	}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int num=sc.nextInt();
		MethodHW5 obj=new MethodHW5();
		System.out.println(obj.prime(num));
		


	}

}


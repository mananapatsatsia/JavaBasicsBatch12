package com.syntax.class04;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		//a=100; b=200; c=300;
		
		System.out.println("Please, enter first number");
		int num1=sc.nextInt();
		
		System.out.println("Please, enter second number");
		int num2=sc.nextInt();

		System.out.println("Please, enter third number");
		int num3=sc.nextInt();

		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1+ " is the largest number");
			}else {
				System.out.println(num3+" is the largest number");
			}
		}
		else {
			if(num2>num3) {
				System.out.println(num2+" is the largest number");
			}else {
				System.out.println(num3+" is the largest number");
			}
}
		
		
		
		
	}

}

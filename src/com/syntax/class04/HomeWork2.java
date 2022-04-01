package com.syntax.class04;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner ask=new Scanner(System.in);
		System.out.println("As a DMW officer, I want to know your age");
		int age=ask.nextInt();
		if (age>=18) {
		System.out.println("You are eligible to have Driver License");
		}else {
			System.out.println("You shall get learners permit first");
		}
	}

}

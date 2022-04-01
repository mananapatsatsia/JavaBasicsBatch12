package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*Print numbers from 1 to 50 except those that are divisible by 3
         *Create a program that will keep asking user to apply for a credit
         * card. As soon you get “yes” from a user program should stop asking.
		 */
		for ( int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");	
		}
		Scanner sc = new Scanner(System.in);
		String answer;
		do {
			System.out.println("Do you want to apply for a credit card?");
			answer = sc.nextLine();
		} while (!answer.equals("yes"));
		
		System.out.println("Congrats! Here your card");
	}

}

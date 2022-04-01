package com.syntax.class04;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		String answer=sc.nextLine();
		
		if(answer.equalsIgnoreCase("no")) { 
			System.out.println("Can we offer you a new credit card");
		}else if(answer.equalsIgnoreCase("yes")){
			System.out.println("What is the balance on your credit card?");
			int balance=sc.nextInt();
			
			if(balance>1000) {
				System.out.println("You have to pay off your balance");
			}else {
				System.out.println("You can spend more ( haha, yes , sure)))");
			}
		}
		

	}

}

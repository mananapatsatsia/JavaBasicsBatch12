package com.syntax.class04;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please, enter where are you from?");
		
		String country=scan.next();//nextLine();
		System.out.println("You are from "+country);
		 
		if (country.equalsIgnoreCase("USA")) { //equalsIgnoreCase
			System.out.println("You speak english");
		}else if(country.equals("France")) {
			System.out.println("You speak france");
		}else if(country.equals("Turkey")){
			System.out.println("You speak turkish");
		}else {System.out.println("I dont know your language");
				 
		}
	}

}

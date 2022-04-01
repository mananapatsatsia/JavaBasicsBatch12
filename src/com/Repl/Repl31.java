package com.Repl;

import java.util.Scanner;

public class Repl31 {

	public static void main(String[] args) {
		 String sunny="yes";
		  Scanner sc=new Scanner(System.in);

		  System.out.println("Is it sunny outside");
	String guess=sc.next();



		  if(sunny.equals(guess)){
		    System.out.println("It is a sunny day, I should go somewhere!");
		    System.out.println("What is the temperature outside?");
		    
		    int temp=sc.nextInt();
		    if(temp>85) 
		    	System.out.println("I am going to the beach");
		    else System.out.println("I am going to the park");
		  }else{
		    System.out.println("I stay home and practice Java");
		  }

		  //System.out.println("What is the temperature outside?");
		  //int temp=sc.nextInt();
	}

}

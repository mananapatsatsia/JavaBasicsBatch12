package com.Repl;

import java.util.Scanner;

public class Repl35Loan {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		   System.out.println("Do you need a loan?");

		  
		   int score=0;
		   boolean loan=sc.nextBoolean();

		   
		   
		   if(loan==true){
			   
		     System.out.println("What is your credit score?");
		    score=sc.nextInt();
		     if(score<600) {
		    	 System.out.println("Not eligible");
		     }
		     else if(score>=600 && score<=700){
		    	 System.out.println("Maybe eligible");
		     }
		     else if(score>701 && score<=800 ) {
		    	 System.out.println("Eligible");
		     }
		     else if( score>800) {
		    	 System.out.println("Definitely eligible");
		     }
		   }
		   else{
		     System.out.println("Unknown");
		   }

	}

}

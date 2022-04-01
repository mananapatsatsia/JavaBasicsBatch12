package com.Repl;

import java.util.Scanner;

public class Repl33EvenOdd {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    int number, remainder;
		    System.out.println("Please enter a number");
		     number=sc.nextInt();
		     
		     remainder=number%2;
		    if(remainder==0){
		      System.out.println("Value is even");
		      if(number>1000){
		        System.out.println("Even value is large");
		      }else {
		        System.out.println("Even value is just right");
		      }
		    }if(remainder!=0)
		      System.out.println("Value is odd");
		     if(number<1000){
		     {
		      System.out.println("Odd value is just right");
		    }
		    
		  
		  }
		   
		  } 

	

}

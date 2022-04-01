package com.Repl;

import java.util.Scanner;

public class Repl32 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);

	       System.out.println("Please enter your gender:");
	       String gender=sc.next();
	      
	      System.out.println("Please enter your age");
	      int age=sc.nextInt();
	      
	      if(age>25)
	    	  if(gender.equalsIgnoreCase("F")) { 
	    	  System.out.println("Woman");
	    	  }
	    	  else {
			    	System.out.println("Man");
			       }
	    	  
	    	  
	    	  
	      else if(age<25) {
	    	  if (gender.equalsIgnoreCase("F")) { 
	    	   System.out.println("Girl");
		    	  } 
	      } else {
    		  System.out.println("Boy");
	       }
		     
	       
	    	   
	       }
	      
		}  
	  
	    	   




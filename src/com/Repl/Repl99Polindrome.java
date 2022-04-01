package com.Repl;

import java.util.Scanner;

public class Repl99Polindrome {

	public static void main(String[] args) {
		  String  reverse="";
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String givenString = inp.nextLine();
		   	//write your code below
		    int length=givenString.length();
		    for(int i=length-1;i>=0;i--)
		      reverse=reverse+givenString.charAt(i);
		      
		    
		     if(givenString.equalsIgnoreCase(reverse))
		       //sysoSystem.out.println("THe word  "+givenString+" is a polindrome");
		      System.out.println(true);
		else
		       System.out.println(false);
		
	
	}
}

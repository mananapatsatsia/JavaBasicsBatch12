package com.Repl;

import java.util.Scanner;

public class Repl101 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    String mainWord="";
	   
	    
	   for(int i=0;i<word.length();i+=2){
		   mainWord+=word.charAt(i);
	   }
	    System.out.println(mainWord);
	  }
}

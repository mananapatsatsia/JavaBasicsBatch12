package com.Repl;

import java.util.Scanner;

public class Repl105Char {
	 public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    //write your code below
		    String ch;
		    for(int i=0;i<word.length();i++){
		      ch=word.charAt(i);
		      if(ch.charAt(i)=='a'){
		        System.out.print(ch);
		      //}else{
		       // System.out.println("Nothing");
		     // }
		    }System.out.println();
		  }
}

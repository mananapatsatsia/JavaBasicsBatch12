package com.Repl;

import java.util.Scanner;

public class Repl100ReverseString {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
		    //write your code below
		    String word="";
		    char ch;
		    
		    for(int i=0;i<s.length();i++){
		    	ch=s.charAt(i);
		    	word=ch+word;
		    	 
		    }
		    System.out.println(word);
	}

}

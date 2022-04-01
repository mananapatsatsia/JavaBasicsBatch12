package com.Repl;

import java.util.Scanner;

public class Repl36Ogly {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    String word1;
		    String word2;
		    int int1;
		    int int2;

		    System.out.println("Please enter two strings");
		    word1=sc.next();
		    word2=sc.next();
		    System.out.println("Please enter two numbers");
		    int1=sc.nextInt();
		    int2=sc.nextInt();

		    if(word1.equals(word2) && int1==int2){
		      System.out.println("AND");
		    }else if( int1==int2 || word1==word2){
		      System.out.println("OR");
		    }else if( int1!=int2 && word1!=word2){
		      System.out.println("NONE");
		    }

	}

}

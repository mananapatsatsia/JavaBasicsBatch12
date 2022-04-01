package com.Repl;

import java.util.Scanner;

public class Repl37Ogly {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);

		    System.out.println("Are you thirsty?");
		    boolean thrs=sc.nextBoolean();

		    System.out.println("Are you sleepy?");
		    boolean slp=sc.nextBoolean();

		    if(thrs=true){
		      String drink="water";
		      System.out.println("Looks like you need to drink "+ drink);
		    }else if(thrs&&slp){
		      String drink="coffee";
		      System.out.println("Looks like you need to drink "+drink);
		    }else if(!thrs==slp){
		      String drink="tea";
		      System.out.println("Looks like you need to drink "+drink);
		    }
		    else{
		      System.out.println("Looks like you need to drink nothing");
		    }
		  }
		 

	}



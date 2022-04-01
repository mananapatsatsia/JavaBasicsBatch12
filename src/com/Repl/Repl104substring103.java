package com.Repl;

import java.util.Scanner;

public class Repl104substring103 {
	 public static void main(String[]args){
		    Scanner sc=new Scanner(System.in);
		    String [] arr=new String[5];
		    System.out.println("Please, enter the name");
		    
		    for(int i=0;i<5;i++){
		      arr[i]=sc.next();
		    }System.out.println();
		    for(int i=0;i<5;i++){
		      System.out.println(arr[i].substring(0,3));
		    }
		    
		  }
}

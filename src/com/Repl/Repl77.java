package com.Repl;

import java.util.Scanner;

public class Repl77 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    int []ele=new int[5];
		   
		    for(int i=0;i<ele.length;i++){
		     
		      int num=sc.nextInt();
		       ele[i]=num;
		      System.out.println();
		    }
		  for(int j=ele.length-1;j>=0;j--) {
			  System.out.println(ele[j]);
		  }
	}

}

package com.Repl;

import java.util.Scanner;

public class Repl64 {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number");
		  int x=sc.nextInt();

		  for(int i=0;i<x*2;i++) {
		  System.out.print(i+" ");
		  //i=x*i;
		  }
		  System.out.println();
	}

}

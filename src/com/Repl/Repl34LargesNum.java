package com.Repl;

import java.util.Scanner;

public class Repl34LargesNum {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    int num1, num2, num3;
		    System.out.println("Please enter 3 distinct numbers");
		    num1=sc.nextInt();
		    num2=sc.nextInt();
		    num3=sc.nextInt();
		   

		    if(num1>num2){
		      if(num1>num3) {
		      System.out.println("The largest number is "+num1);
		      }
		    else{
		      System.out.println("The largest number is "+num3);
		    }
		    
		      }
		    	else {
		    	if(num2>num3) {
		    		System.out.println("The largest number is "+num2);
		    	}else {
		    		System.out.println("The largest number is "+num3);
		    	}
		    }
		    
		    }}
		    
		    

	



package com.syntax.reviewclass6;

public class Patterns {

	public static void main(String[] args) {
           for(int i=1;i<=5;i++) {
        	   System.out.print("*");
           }
           System.out.println();
           for(int i=1;i<=5;i++) {
        	   System.out.print("*");
           }
           System.out.println();
           for(int i=1;i<=5;i++) {
        	   System.out.print("*");
           }
           System.out.println();
           for(int i=1;i<=5;i++) {
        	   System.out.print("*");
           }
           System.out.println("===Better way====");
           for(int r=0;r<=4;r++) {
        	   for(int col=1;col<=5;col++) {
        		   System.out.print("*");
        	   }
        	   System.out.println();
           }
           System.out.println("===Better way====");
           for(int r=1;r<=5;r++) {
        	   for(int col=1;col<=r;col++) {
        		   System.out.print(r+" ");
        	   }
        	   System.out.println();
       	
           }
          
	}

}

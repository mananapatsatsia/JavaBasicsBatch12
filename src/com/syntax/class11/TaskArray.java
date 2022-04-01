package com.syntax.class11;

public class TaskArray {

	public static void main(String[] args) {
		//create an array and retrieve all elements in reverse order
          int[] num= {10,20,30,40,50};
         //int max=num[0];
          for(int i=num.length-1;i>=0;i--) {
        	  System.out.println(num[i]);
        	  
        	  
          }
          System.out.println();
          System.out.println("another way");
          
          int [] arrs= {10,20,30,40,50};
        	  for(int i=0; i<arrs.length; i++) {
        		  System.out.println(arrs[arrs.length-i-1]);
        	  }
          }
	

}

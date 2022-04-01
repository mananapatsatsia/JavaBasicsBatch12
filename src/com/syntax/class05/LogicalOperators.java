package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

	    System.out.println("Are you thirsty?");
	    boolean thrs=sc.nextBoolean();

	    System.out.println("Are you sleepy?");
	    boolean slp=sc.nextBoolean();

	    if(thrs==true && slp==false){
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

		/*    &&  AND
		 * True && True-->True
		 * True && False-->False
		 * False && True-->False
		 * False && False--> False
		 */

	}
	
	
	/*    ||   OR
	 * False || False-->False
	 * False || True-->True
	 * True || False-->True
	 * True |\ True-->True
	 */
	
	/*    !   NOT
	 *False-->True
	 *True-->False 
	 */

}

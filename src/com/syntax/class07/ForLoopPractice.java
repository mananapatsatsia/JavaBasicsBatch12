package com.syntax.class07;

public class ForLoopPractice {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			System.out.println("Hello "+i);
		}
		System.out.println(" MULTIPLICATION TABLE  ");
		/*3X1=3
		 *3X2=6
		 *3X3=9
		 *3X10=90 
		 */
		int num=3;
		int result;
		
		for(int i=1; i<=10; i++) {
			result=num*i;
			System.out.println(num+" X "+i+" = "+result);
		}

	}

}

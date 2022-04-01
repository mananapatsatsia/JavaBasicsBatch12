package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		/*I need to compare 2 numbers and I have to find which is bigger
		 * 
		 */
          int num1=100;
          int num2=50;
           if(num1<num2) {
        	   System.out.println(num1 +" is the larger then "+num2);}
            else {System.out.println(num1+ " is the larger then "+num2);
           }
	
	double money=5;
	double coffee=5.99;
	
	if(money>coffee) {
		System.out.println(" I am buying the coffee");
	
	}//if(money=coffee){ Error because if condition always must be boolean, we use double-->because of the wrong operator
	
	}
}

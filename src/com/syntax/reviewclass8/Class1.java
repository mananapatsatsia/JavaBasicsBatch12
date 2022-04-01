package com.syntax.reviewclass8;

public class Class1 {
	public void printSmallerDigit(int x,int y) {
		if(x<y) {
			System.out.println(x+" is the smaller one");
		}else if(y<x){
			System.out.println(y+"  is the smaller");
		}else {
			System.out.println("Both the values are the same");
		}
		
	}
   public static void main(String[] args) {
	   Class1 class1= new Class1();
	   class1.printSmallerDigit(3, 5);
	   class1.printSmallerDigit(7, 9);
}
}

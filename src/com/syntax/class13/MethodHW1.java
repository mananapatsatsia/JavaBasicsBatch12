package com.syntax.class13;

public class MethodHW1 {
	/*Create a method that will take 2 parameters 
	 * as a numbers and prints which number is larger. 
	 */
	int number(int large, int small) {
		if(large>small) {
			return large;
		
		}else {
			return small;
		}
	}

	public static void main(String[] args) {
		MethodHW1 obj=new MethodHW1();
		System.out.println(obj.number(10, 5)+" is the largest number");
		System.out.println(obj.number(5, 50)+" is the largest number");

	}
//რ�?ც�? �?რ ითხ�?ვს რეთურნს, მ�?შნ იხმ�?რე ვ�?იდი.
}

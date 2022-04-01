package com.syntax.class16;

public class Task5 {

	public static void main(String[] args) {
		Task5 task=new Task5();
//		System.out.println(task.isPalidrome(inputStr."aba"));//inputStr:"aba"
//	    System.out.println(task.isPalidrome(inputStr:"Abbc"));
	    System.out.println(task.isPalidrome("aba"));
	}
	boolean isPalidrome(String inputStr) {
		String reverseStr=reverseString(inputStr);//reversedStr:"cbba"
		return reverseStr.equals(inputStr);
	}
	String reverseString(String inputString) {
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.reverse();
		return stringBuilder.toString();
}
}
package com.syntax.class16;

public class Task4 {

	public static void main(String[] args) {
		String s="Sunday is great";
		Task4 task4=new Task4();
		System.out.println(task4.reverseString(s));
	//	String []strArray=s.split(regex:" ");
		//syso(strArray[0]);
		//for(int i=0;i<strArray.length;i++){
			//System.out.println(task4.reverseString(strArray[i]+" "));
		//}
	}
		String reverseString(String inputString) {
			StringBuilder stringBuilder=new StringBuilder();
			stringBuilder.reverse();
			return stringBuilder.toString();
		}
	
}

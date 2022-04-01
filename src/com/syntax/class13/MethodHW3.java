package com.syntax.class13;

import java.util.Scanner;

public class MethodHW3 {
	/*Create a method that will say Hello in different language based
	 *  on the country that will passed when method is executed.
	 */
	String country(String hello) {		
		if(hello.equalsIgnoreCase("Russia")) {
			return "Privet";
		}
		else if(hello.equalsIgnoreCase("America")) {
			return "Hello";
		}else if(hello.equalsIgnoreCase("Spain")) {
			return "Hola";
		}else if(hello.equalsIgnoreCase("Georgia")) {
			return "Gamarjoba";
		}else if(hello.equalsIgnoreCase("France")) {
			return "Bonjour";
		}
				else {
			return "Unknown";
		}
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any country name");
		String hello=sc.next();
		MethodHW3 obj=new MethodHW3();
		System.out.println(obj.country(hello));
		
	}

}

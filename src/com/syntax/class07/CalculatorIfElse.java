package com.syntax.class07;

import java.util.Scanner;

public class CalculatorIfElse {

	public static void main(String[] args) {
		Scanner calc = new Scanner(System.in);
		System.out.println("Please enter your first value.");
		int val1 = calc.nextInt();
		System.out.println("Please enter desired operation:+,-,*,/");
		char op = calc.next().charAt(0);
		System.out.println("Please enter your second value.");
		int val2 = calc.nextInt();
		int result = 0;
		if (op == '+') {
		result=val1 + val2;
		} else if (op == '-') {
		result=val1 - val2;
		} else if (op == '*') {
		result=val1 * val2;
		} else if (op == '/') {
		result=val1 / val2;
		} else {
		System.out.println("Invalid entry.");
		}
		System.out.println(result);
		}
	}



package com.syntax.reviewclass3;

public class IfElseDemo2 {

	public static void main(String[] args) {
		int age = 13;
		if (age >= 13) {
			System.out.println("you can play this game");
		} else {
			System.out.println("you can't play this game");
		}

		String country = "USA";
		if (!country.equals("USA")) {
			System.out.println("You can't pay from USA");
		} else {
			System.out.println("You are allowed");
		}

		boolean flag = !true;
		int number1 = 10;
		if (!!flag != true && number1 != 15) {
			System.out.println("line 1");
		} else {
			System.out.println("Line 2");
		}

		int number = 10;
		if (number == 10) {
			System.out.println("Number is 10");
		}
		if (number == 15) {
			System.out.println("Number is 15");
		}
		if (number == 20) {
			System.out.println("Number is 15");
		}
		// best practice to write if conditions
		if (number == 10) {
			System.out.println("Number is 10");
		} else if (number == 15) {
			System.out.println("Number is 15");
		} else if (number == 20) {
			System.out.println("Number is 20");
		}

		System.out.println("========IfElseDemo5========");
		int price = 10;
		boolean sale = true;
		char gender = 'F';
		double discount = 0.15;
		double finalPrice = 0;
		if (sale) {
			if (gender == 'F') {
				if (price > 5) {
					// finalPrice=price-price*discount;
					System.out.println("line 1");
				}
			}
		} else {
			// finalPrice=price;
			System.out.println("line 2");
		}
		if (sale && gender == 'F' && price > 5) {
			// finalPrice=price-price*discount;
			System.out.println("line 1");
		} else {
			// finalPrice=price;
			System.out.println("line 2");
		}
	}
}

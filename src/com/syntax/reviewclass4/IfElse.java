package com.syntax.reviewclass4;

public class IfElse {

	public static void main(String[] args) {
		String month = "Feb";
		int day = 2;

		if ("Jan".equals(month)) {
			if (day == 1)
				System.out.println("it is the first of Jan");
			else {
				System.out.println("It is the jan but not first");

			}

		} else {
			System.out.println("It is not Jan");
		}
	}

}

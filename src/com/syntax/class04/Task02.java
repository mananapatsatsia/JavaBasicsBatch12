package com.syntax.class04;

public class Task02 {

	public static void main(String[] args) {
		double rate=3.5;//5.5
		int price=75000;//45000
		if(rate>4.5) {
			System.out.println("Too expensive,not gonna buy!");
			//if (rate<4.5) 
				//System.out.println("I will think, may be I'll buy the house");
		}else {
				System.out.println("I can buy  the house");
				if(price>50000) {
					System.out.println("I should take a loan");
				}else {
					System.out.println("I can pay cash");
				}
			
		}

	}

}

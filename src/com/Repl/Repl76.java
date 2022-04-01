package com.Repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] days = new String[7];
		int days1=0;
		
		for (int i = 0; i <days.length; i++) {
			days1++;
			System.out.println("Please enter day " + days1 + " of the week");
			String day = sc.next();
			days[i]=day;
		}

			for (int j = 0; j < days.length; j++) {
				
				 System.out.println(days[j]);
			}
			
			System.out.println();
		}
		
	

}

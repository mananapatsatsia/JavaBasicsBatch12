package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkClass5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your heights");
		int inches=sc.nextInt();
		
		if(inches<60) {
			System.out.println("Your height  "+inches+" inches  is  under Short category");
		}else if(inches>60 && inches< 72) {
				System.out.println("Your height  "+inches+" inches  is  under Medium category");
			}
		else  {
				System.out.println("Your height  "+inches+" inches  is  under Tall category");
			}
		}
		
			

	}



package com.syntax.class06;

import java.util.Scanner;

public class GradesSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Which grade did you get?");
		char grade=sc.next().charAt(0);
		grade=Character.toUpperCase(grade);
	
		String expln;
		
		switch(grade) {
		case'A':
			expln="Excellent";
			break;
		case'B':
			expln="Good";
			break;
		case'C':
			expln="Avarage";
			break;
		case'D':
			expln="Bad";
			break;
			default:
				expln="Unknown";
		
		}
		
		System.out.println("Your "+grade+" is "+expln);
			
	}

}

package com.syntax.class11;

public class TaskTwoDerrey {

	public static void main(String[] args) {
		String[][] pref= new String[3][4];
		pref[0][0]="Mr";
		pref[0][1]="Mrs";
		pref[0][2]="Ms";
		pref[0][3]="Miss";
		
		pref[1][0]="Smith";
		pref[1][1]="Jordan";
		pref[1][2]="Jackson";
		pref[1][3]="Obama";
		
		System.out.println(pref[0][1]+"."+pref[1][0]);
		System.out.println(pref[0][0]+"."+pref[1][3]);
		System.out.println(pref[0][2]+"."+pref[1][2]);
		System.out.println(pref[0][3]+"."+pref[1][1]);
		
		
		
		

	}

}

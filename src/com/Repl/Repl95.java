package com.Repl;

import java.util.Scanner;

public class Repl95 {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Please print any word");
		String word=sc.next();
		  System.out.println("The first 3 letters of "+word+" is "+word.substring(0,3));

	}

}

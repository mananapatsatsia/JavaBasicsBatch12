package com.Repl;

import java.util.Scanner;

public class Repl78 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int[]arr=new int[5];
	    for(int i=0;i<arr.length;i++){
	      int num=sc.nextInt();
	      arr[i]=num;
	      System.out.println();
	      }
	    for(int j=0;j<arr.length;j++){
	      System.out.println(arr[j]*10);
	    }
	      
	}

}

package com.syntax.class10;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		int[] nums = { 1000, 2000, 300, 40, 50, 60, 70000 };

		int largestNum = 0;

		for (int i = 0; i < nums.length; i++) {

			if (largestNum < nums[i]) {
				largestNum = nums[i];
			}

		}
		System.out.println("The largest num is "+largestNum);
		System.out.println("-------------------------------");
		 Scanner input = new Scanner(System.in);
		    System.out.println("Task: Find largest Num in Array");
		    int size = 3;
		    int[] numbers = new int[size];
		    // taking input
		    for(int i=0; i<size; i++){
		        System.out.print("Enter a number: ");
		        numbers[i]=input.nextInt();
		    }
		    // finding largest
		    int largest = numbers[0];
		    for(int x=1; x< numbers.length; x++){
		        if(numbers[x]>largest){
		            largest = numbers[x];
		        }
		
		    }
	}

}

package groupeProjectsMess;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num1=sc.nextInt();
		System.out.println("Please enter the second number");
		int num2=sc.nextInt();
		int [] num= {num1,num2};
		
			System.out.println(num[0]+num[1]);
		System.out.println("==============================");
			//Ceces way
		int length = sc.nextInt(); 
		int[] input = new int[length]; 
		System.out.println("Please enter elements of array"); 
		for (int i = 0; i < length; i++)
		{ 
			input[i] = sc.nextInt(); 
			} 
		int total=sumOfElements(input);
		
		System.out.println("Sum of all elements of array is " + total); sc.close(); }

	public static int sumOfElements(int[] array)
	
	{ int sum = 0; for (int i : array) { sum = sum + i; } 
	
	return sum;
	}
	

}

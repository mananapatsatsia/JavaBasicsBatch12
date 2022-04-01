package groupeProjectsMess;

import java.util.Arrays;
import java.util.Scanner;

public class AsgharTask1 {

	public static void main(String[] args) {
		/*
		 * Create an array on int values using a scanner and calculate
		 * the sum of all stored elements in that array
		 */
		//Pseudo programming
		//1) Take the size of the Array using scanner class from the user
		//2) create an int array of above size
		//3) fill the array with elements from the user using scanner class
		//4) sum all the elements of the array
		//5) A class that heps use take the input from the keyboard
		Scanner scanner=new Scanner(System.in);
		//prompt the user for the size
		System.out.println("Please Enter the size of the array");
		//take the size from the user and store it in the size variable
		int size=scanner.nextInt();
		//print out the size
		System.out.println("Size of the Array "+size);
		//2) create an int array of above size
		int[] array=new int[size];
		//fill the array with elements from the user using scanner class
		System.out.println("Please enter "+size+" elements");
		for(int i=0;i<size;i++) {
			System.out.println("Please enter the element for index "+i);
			array[i]=scanner.nextInt();
		}
		//print out the elements of an array with out a loops
		System.out.println(Arrays.toString(array));
		/*
		 * Create an array of int values using a scanner and calculate the sum of all
		 * stored elements in that array.
		 */
		
		// Pseudo programming: 
		// 1. Take the size of the Array using scanner class from the user
		// 2. create an int array of above size
		// 3. fill the array with elements from the user suing scanner class
		// 4. sum all elements of the array

		// Step 1
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the size of the array");

		int size1 = scan.nextInt(); // taking the size of the array
		System.out.println("Size of the array " + size1);

		// Step 2
		int[] arr = new int[size1];

		// Step 3
		System.out.println("Please enter " + size1 + " elements");
		for (int i = 0; i < size1; i++) {
			System.out.println("Please enter the element for index " + i);
			arr[i] = scan.nextInt();
		}

		// *print out the elements of an array without loop
		System.out.println(Arrays.toString(arr));

		// Step 4
		int sum = 0;

		for (int x = 0; x < arr.length; x++) {
			sum += arr[x];
		}
		System.out.println("The sum of all elements is " + sum);
		
	}

}

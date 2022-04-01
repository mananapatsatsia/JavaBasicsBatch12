package groupeProjectsMess;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int num=sc.nextInt();
		
		if(num%2!=0 && num>1) {
			System.out.println("The "+num+ " is prime");
		}else {
			System.out.println("The "+num+ " is not prime ");
		}

	}

}

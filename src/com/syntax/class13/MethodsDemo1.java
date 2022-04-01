package com.syntax.class13;

public class MethodsDemo1 {
	//void is a type of a methods that don't return anything when called
	//checkEvenOdd it is the name to the method
	//()-parentesis we use to pass information from outside.
	// int number is a parameter that we can pass to this method when called
	// we can use this variable inside the logic of method
	void checkEvenOdd(int number) {
		if (number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}
	}
		void edward(boolean isRaining) {
			if(isRaining) {
				System.out.println("I am staying home");
				
			}else {
				System.out.println("Lets go for a walk");
		}
		}	
			void checkName(String name) {
				if(name.equalsIgnoreCase("Teyfur")) {
					System.out.println(name+" send memes");
				}else if(name.equalsIgnoreCase("Maha")){
					System.out.println("Doctor");
				}else {
					System.out.println("Unknown");
				}
				
			}
	

	public static void main(String[] args) {
           MethodsDemo1 object1=new MethodsDemo1();
           object1.checkEvenOdd(120);
           object1.checkEvenOdd(3);
           object1.checkEvenOdd(7);
           object1.edward(false);
           
           object1.checkName("Teyfur");
           object1.checkName("Maha");
	}

}

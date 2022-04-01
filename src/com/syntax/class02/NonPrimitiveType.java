package com.syntax.class02;

public class NonPrimitiveType {

	public static void main(String[] args) {
         int age=25;
		String name="Manana";
		String lastName="Patsatsia";
		long phoneNumber=123456789l;
		String mobile="12-3456-5788";
		String address="123 Test Street";
		String feeling="like";
		String food="kebab";
		
		
		//concatenation operator
		//String is the class inside the java library
	System.out.println(name +" " + lastName);
	System.out.println(name+" is "+age+" years old");
	System.out.println("I live on "+address);
	System.out.println("I "+feeling+" "+food);
	
	feeling ="love";
	food="shrimp";
	System.out.println("I "+feeling+" "+food);

	
	
	}

}

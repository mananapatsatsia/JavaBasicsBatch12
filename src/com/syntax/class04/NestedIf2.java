package com.syntax.class04;

public class NestedIf2 {

	public static void main(String[] args) {
		
		/*declare a variable for allergy
         * if you have allergy-->if you have pollen
         *                       if you have peanut
         *                       if you have wheat
         * if no allergy--> you are lucky
         */
		boolean allergy=true;
    	//false
    if(allergy) {
    	System.out.println("Let's check what allergies you have");
    	String allergyType="pollen";//gluten,//peanut.
    	
    	if(allergyType.equals("poolen")) {
    		System.out.println("Please, stay at home when trees are blooming");
    	}else if(allergyType.equals("peanut")) {
    		System.out.println("Please, do not eat food that containt nuts");
    	}else if(allergyType.equals("gluten")) {
    		System.out.println("Please,follow gluten free diet.Take medication");
    	}else {
    		System.out.println("I don't which suggestion to give you");
    	
    	}
    }else {
    	System.out.println("You are lucky");
    }
	}

}

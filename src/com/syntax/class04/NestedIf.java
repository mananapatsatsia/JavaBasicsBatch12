package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		boolean vaccine=true;//false
		int dose=2;//1
		if(vaccine) {
			System.out.println("How many does you have");
			if(dose==1) {
				System.out.println("You need another shot");
			}else {
				System.out.println("You are fully vaccinated");
			}
		//}else {
			//System.out.println("I don't have any question");
		
          System.out.println("---------------------");
          /*
           * declare a variable for allergy
           * 
           * if you have allergy --> if you have pollen if you have peanut if you
          have
           * wheat if no allergy --> you are lucky
           */
          boolean allergy = false;
          if (allergy) { // outer if
          System.out.println("Let's check what allergies you have");
          String allergyType = "pollen";
          // nested if -> always has a dependency on outer if.
          // outer if MUST be true in order for nested if to be checked
          if (allergyType.equals("pollen")) {
          System.out.println("PLease stay at home when trees are blooming. Take med A");
          } else if (allergyType.equals("peanut")) {
          System.out.println("PLease do not eat food that contains nuts. Take med B");
          } else if (allergyType.equals("gluten")) {
          System.out.println("Please follow gluten free diet. Take med C");
          } else {
          System.out.println("I don't which suggestion to give you");
          }
          } else {
          System.out.println("You are lucky");
          }
          
	}
}
          
	    
	    
	    
}     

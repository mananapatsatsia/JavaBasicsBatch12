package com.syntax.class18;

public class AccessModifiers {
     private String name="Naughty Tarik";
     int age; // default access
     protected double weight;
     public String color="White";
     
     public static void main(String[] args) {
    	 AccessModifiers am=new AccessModifiers();
    	 System.out.println(am.name);
    	 System.out.println(am.age);
    	 System.out.println(am.weight);
    	 System.out.println(am.color);
	}
}

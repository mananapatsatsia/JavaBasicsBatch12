package com.syntax.class12;

public class Dog2Task2 {
	//Create a Dog Class and create 3 different objects of it:
	//Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	String name;
	String breed;
	int age;
	boolean vaccinated;
	
	void bark() {
		System.out.println(name+" is barking on cats and Java instructors))");
	}
	
	void sleep() {
		System.out.println(name+" is an old, he is "+age+" years old");
	}

	void condition() {
		System.out.println(name+" is a "+breed+ " and likes a cold enviroment");
		System.out.println(name+" is vaccinated "+vaccinated);
	}
          public static void main(String[] args) {
        	  Dog2Task2 dog =new Dog2Task2();
        	  dog.name="Sharik";
        	  dog.breed="Husky";
        	  dog.age=18;
        	  dog.vaccinated=true;
        	  dog.bark();
        	  dog.sleep();
        	  dog.condition();
        	  System.out.println("===================================");
        	  Dog2Task2 dog1=new Dog2Task2();
        	  dog1.name="Bim";
        	  dog1.breed="Bulldog";
        	  dog1.age=18;
        	  dog1.vaccinated=true;
        	  dog1.bark();
        	  dog1.sleep();
        	  dog1.condition();
        	  System.out.println("====================================");
        	  Dog2Task2 dog2=new Dog2Task2();
        	  dog2.name="SHarlota";
        	  dog2.breed="Labrador";
        	  dog2.age=3;
        	  dog2.vaccinated=true;
        	  dog2.bark();
        	  dog2.sleep();
        	  dog2.condition();
        	  
          }
}

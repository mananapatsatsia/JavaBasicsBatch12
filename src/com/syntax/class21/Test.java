package com.syntax.class21;

public class Test {
	public static void main(String[] args) {
		ClassBB classbb=new ClassBB("Tristan", 25,91);
		classbb.printInfo();
	
      }
}
class ClassBB extends Test1{
	public ClassBB(String name,int age,double weight) {
		super(name,age,weight);
		//Because constructor from the parent classes don't participate in inheritance we need to create the matching
		//constructor in the child classes as well
		//we can use super() to call the constructor from the parent class so that we don't have to repeat the code
	}
	
}
class Test1{
	String name;
	int age;
	double weight;
	
	public Test1(String name, int age, double weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
		
	}
      void printInfo() {
    	  System.out.println(name+" "+age+" "+weight);
	
	}
	
}
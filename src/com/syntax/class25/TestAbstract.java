package com.syntax.class25;
//can have only one Abstract class and extend the same only one.
abstract class Abstract{
	protected int i=0;//we can have any kind of access modifiers (public,protected,default,private)
	static final int f=100;
	
	abstract void show();  //non implemented method needs to be declared with abstract keyword.
	
	// within the abstract class we can have both-abstract and non-abstract methods.
	
	void display() {//Concrete method with a body
		System.out.println("Non-abstract method");
	}
	
}

public class TestAbstract extends Abstract{
	@Override
	void show() {
		System.out.println("This is show() of Abstract class");
		
	}

	public static void main(String[] args) {
		Abstract a=new TestAbstract();
		a.display();
		a.show();
		
		a.i=10;
		System.out.println(a.i);
		System.out.println(Abstract.f);
		
           
	}

	

}

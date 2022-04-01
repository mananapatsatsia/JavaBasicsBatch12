package com.syntax.class25;

interface I {
	int i=10;//by default always public static final
	void display(); // by default always public abstract
}
interface II {  //can have multiple interface and can implement them all in one .
	int i=10;
	void display(); 
}

public class TestInterface implements I,II{

	@Override
	public void display() {
		System.out.println("This is display () of interface");
	}

	public static void main(String[] args) {
		I iRef=new TestInterface();
		iRef.display();
		System.out.println(I.i);
    
	}


}

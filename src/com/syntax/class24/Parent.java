package com.syntax.class24;

public class Parent { // can use final keyword to not inherit from here.can be used with the class
	final String name="Vladlen";// can be used with variables also.
	final void method() {//---also could be used with methods
		System.out.println("I am parent");
		
	}
}
class child extends Parent{
	/* void method(){
	 * can't overide because it is final method	 * 
	 */
	
}
//FINAL
/*Class
*Methods
*Variables
*/
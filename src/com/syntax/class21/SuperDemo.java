package com.syntax.class21;

public class SuperDemo {
	
	

	class AAA {
	    AAA() {

	    }
	}

	class BBB extends AAA{
	    String name;

	    BBB() {

	    }

	    BBB(String name) {
	        super();
	      //  this(); we can't use this() and super() inside the same constructor
	        this.name = name;
	    }

	}

}

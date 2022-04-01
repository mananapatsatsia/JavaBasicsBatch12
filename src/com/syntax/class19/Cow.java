package com.syntax.class19;

public class Cow {
	/*The constructor that is provided automatically
	 *  when we dont create any constructors 
	 *  in a class is called default constructor
	*/

	static int normalNumberOfLegs=4;
	/*
	 * 
	 */
	private String name;
	int age;
	double weight;
	String breed;
	char gender;
	

	/* Below is zero argument or no argument constructor
	 * 
	 */
	Cow(){
		/*you might want to execute some code to setup the resources
		 * for your class like opening the connection to database checking it internet
		 * is available or not etc...
		 */
	}

}

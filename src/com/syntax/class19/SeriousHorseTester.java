package com.syntax.class19;

public class SeriousHorseTester {

	public static void main(String[] args) {
		ConstructorHorse horse=new ConstructorHorse("Jacky",20,400);
		
		
		
		horse.setName("Jacky");
		
		/*ConstructorHorse-->Data type(Names of classes)
		 * horse-->Object/instance/reference variable/variable
		 * = -->Assignment operator
		 * Horse("Jacky",20,400) -> call to a constructor
		 * ; line terminator
		 */
		horse.printHorseName();
	}

}

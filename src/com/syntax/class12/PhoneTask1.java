package com.syntax.class12;

public class PhoneTask1 {
//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel,
	//Nokia with specific  attributes and behaviors.
	String name;
	String modelNum;
	String opSystem;
	
	void allInOne(){
		System.out.println(name+" is a model "+modelNum+" and operats on "+opSystem);
		
	}
	public static void main(String [] args) {
		PhoneTask1 phone=new PhoneTask1();
		phone.name="iPhone";
		phone.modelNum="13Pro";
		phone.opSystem="iOS";
		phone.allInOne();
		System.out.println("================");
		PhoneTask1 phone1=new PhoneTask1();
		phone1.name="Pixel";
		phone1.modelNum="6Pro";
		phone1.opSystem="Android";
		phone1.allInOne();
		System.out.println("===================");
		PhoneTask1 phone3=new PhoneTask1();
		phone3.name="Nokia";
		phone3.modelNum="G50";
		phone3.opSystem="Android";
		phone3.allInOne();
		
	}
	
	
}

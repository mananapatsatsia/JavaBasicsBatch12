package com.syntax.class13;

public class MethodHW3copySwitch {
	String sayHello(String country) {
		country=country.toLowerCase();
		switch(country) {
			case"USA":
				return "Hello";
				case"France":
					return "Bonjour";
				case"Turkey":
					return "Merhaba";
					default:
						return " Zulfia is a very good and patience student who loves Silva";
		}
	}

	public static void main(String[] args) {
		MethodHW3copySwitch obj=new MethodHW3copySwitch();
		 String country=obj.sayHello("Turkey");
		 System.out.println(country);
	}

}

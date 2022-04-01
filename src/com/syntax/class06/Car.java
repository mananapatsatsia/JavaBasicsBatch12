package com.syntax.class06;

public class Car {

	public static void main(String[] args) {
		 String car="LADA";
		 String country;
		 
		 switch (car.toLowerCase()) {
		 case "BMW" :
			 country="Germany";
			 break;
		 case "Ford" :
			 country="USA";
			 break;
		 case "Toyota" :
			 country="Japan";
			 break;
		 case "lada" :
			 country="Russia";
			 break;
		 case "Citroen" :
			 country="France";
			 break;
			 default:
				 country="Unknown";
				 break;
			 
			 }
    System.out.println(car+" is from "+country);
	}

}

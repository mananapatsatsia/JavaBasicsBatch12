package com.syntax.class13;

public class MethodsTask1 {
	String anyName(String name, String animal) { 
		if(name.equalsIgnoreCase(name) && animal.equalsIgnoreCase(animal)) {
			return "camel";
		}else if(animal.equalsIgnoreCase(animal)) {
			return "Horse";
			
		}else{
			return "Invalid";
		}
		
	
		
		
	}

	public static void main(String[] args) {
		MethodsTask1 obj= new MethodsTask1();
		String result=obj.anyName("Teyfur", "Horse");
		System.out.println(result);
		System.out.println(obj.anyName("Teyfur", "Horse"));
		System.out.println(obj.anyName("Tammer", "Horse"));
		System.out.println(obj.anyName("Teyfur", "Monkey"));
	}

}

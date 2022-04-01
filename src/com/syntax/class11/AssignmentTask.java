package com.syntax.class11;

public class AssignmentTask {

	public static void main(String[] args) {
		String[] country= {"USA","Georgia","Spain","Russia"};
		String [] capitol= {"Washington","Tbilisi","Madrid","Moscow"};
		
		
		for(int i=0; i<country.length;i++) {
			for(int j=0; j<capitol.length;j++) {
				if(i==j) {System.out.println("The capital of the "+country[i]+" is "+capitol[j]);
				
				
				
			}System.out.println("Another way");
			
			String[] countries= {"Macedonia", "Bulgaria", "Serbia", "Croatia"};
			
			for(String country1:countries) {
				
				switch(country1) {
				
				case "Macedonia":
					System.out.println("Skopje");
					break;
				case "Bulgaria":
					System.out.println("Sofia");
					break;
				case "Serbia":
					System.out.println("Belgrade");
					break;
				case "Croatia":
					System.out.println("Zagreb");
					break;
				default:
					System.out.println("Undefined");
				
				}
				}
			}
			}
			
	}
}



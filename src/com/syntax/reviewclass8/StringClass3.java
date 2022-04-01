package com.syntax.reviewclass8;

public class StringClass3 {
	 public static void main(String[] args) {
	        String batch="Batch 12";
	        String course="SDET";


	        // to remove the white space in between our String(space before the syntax).below..>>>
	        String company= "           Syntax     Tech";
	        //company.trim();
	        System.out.println(company.trim());

	        //company.replaceAll(" ","");

	        String name="Nassir hfhfhdhdh     uuyoyoy  asga";
	        System.out.println(name.replaceAll(" ",""));

	        if("Batch 12".equals(batch)&& "SDET".equals(course)){
	            System.out.println("You will get the link to MSs lecture");
	        }else {
	            System.out.println("WATCH MY YOUTUBE CHANNEL");
	        }
	        if("Batch 12".equalsIgnoreCase(batch) && "SDET".equalsIgnoreCase(course)) {
	            System.out.println("Now all types of inputs are accepted");
	        }
	 }
}

package com.syntax.class15;

public class Task002 {

	public static void main(String[] args) {
		/*Create a String and if the String is not empty perform the following: 
		*if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
		*Create a String and print it in reverse order (Sunday → yadnuS).
         */
     //#1
      String name="I have to get any SDET job!";
      System.out.println(!name.isEmpty());
      if(name.length()>=3 && name.length()%2==1) {
    	  System.out.println(name.charAt(name.length()/2));
    	//Asghar code
    	  //String str="Hello";
    	  //if(str.length()%2!=0 && str.length()>3) {
    		//  System.out.println(str.charAt(str.length()/2));
    	 // }
   
      }
      //2
      String name1="Sunday";
	  for(int i=name1.length()-1;i>=0;i--) {
		  System.out.print(name1.charAt(i));
	  }

	}

}

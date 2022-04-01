package com.syntax.class13;

import java.util.Scanner;

public class MethodHW4 {
	/*Create a method createEmail(). Based on values of users name,
	 *  lastName and email type, 
	 * your method should return complete email Address. Example: 
	 *  createEmail(John, Snow, gmail) → johnsnow@gmail.com or  
	 */
	String createEmail(String usName, String lastName,String email) {
		return usName+lastName+"@"+email+".com";
	}

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Please enter your name");
           String usName=sc.next();
             System.out.println("Please enter your last name");
             String lastNameString=sc.next();
               System.out.println("Please enter your email extention");
               String email=sc.next();
               MethodHW4 obj=new MethodHW4();
               System.out.println(obj.createEmail(usName, lastNameString, email));
	}

}

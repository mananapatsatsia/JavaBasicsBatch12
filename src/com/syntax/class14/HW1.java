package com.syntax.class14;

import java.util.Scanner;

public class HW1 {
	/*Accept username, password and confirm password from a user and check following requirements:
      Username and Password cannot be  empty, if so→ message=�?Username and Password cannot be empty�?.
      Password should be minimum 8 characters, if less → message=�?Password is too short�?.
      Password cannot contain username if so, → message=�?Password cannot contain username�?.
      Password should match confirmed password, if not  → message=“Passwords do not match�?.
      Only after all requirements met → message “Your username and password has been created�?
	 */
	String credentials(String usNAme, String Pass, String rePass) {
		if(usNAme.isEmpty() && Pass.isEmpty() ) {
			return "Username and password can not be empty";
		}else if() {
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your username");
		String usNAme=sc.next();
		System.out.println("Please enter your password");
		String Pass=sc.next();
		System.out.println("Please re-enter your password");
		String rePass=sc.next();
		
		HW1 result=new HW1();
		result.credentials(usNAme, PassW, rePass);

	}

}

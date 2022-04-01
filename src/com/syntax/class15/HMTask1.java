package com.syntax.class15;

public class HMTask1 {
	/*Accept username, password and confirm password from a user and check following requirements:
    Username and Password cannot be  empty, if so→ message=�?Username and Password cannot be empty�?.
    Password should be minimum 8 characters, if less → message=�?Password is too short�?.
    Password cannot contain username if so, → message=�?Password cannot contain username�?.
    Password should match confirmed password, if not  → message=“Passwords do not match�?.
    Only after all requirements met → message “Your username and password has been created�?
	 */

	public static void main(String[] args) {
		String userName="user";
		String password="pass";
		String confirmedPassword="pass";
		
		
		
		if(userName.isEmpty()|| password.isEmpty()) {
			System.out.println("Username and password can not be empty");
		}else {
			
		}if(password.length()<8) {
			System.out.println("Password is too short");
		}else {
			
		}if(password.contains(userName)) {
			System.out.println("password can not contain username");
		}else {
			
		}if(password.equals(confirmedPassword)) {
			System.out.println("Your username and password has been created");
		}else {
			System.out.println("Passwords do not match”");
		}

	}

}

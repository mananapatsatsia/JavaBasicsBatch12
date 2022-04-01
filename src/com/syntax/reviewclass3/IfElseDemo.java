package com.syntax.reviewclass3;

public class IfElseDemo {

	public static void main(String[] args) {
		String username="Asghar";
		String password="pass1234";
		if(username.equals("Asghar") && password.equals("pass1234")) {
			System.out.println("welcome back "+username);
		}else {
			System.out.println("Username or password is not correct");
		}

	}

}

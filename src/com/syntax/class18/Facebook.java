package com.syntax.class18;

public class Facebook {
	
	private String userName;
	private String password;
	private int age;
	
	void setAge(int personAge) {
		if( personAge>13 && personAge<120) {
			age=personAge;
			}else {
				System.out.println("Not "+" allowed its not a Horse");
			}
		}
	
	//protecting the age with a password
	int getAge(String userPassword) {
		if(userPassword.equals(password)) {
			return age;
		}else {
			return -1;
		}
	}

	public static void main(String[] args) {
           
	}

}

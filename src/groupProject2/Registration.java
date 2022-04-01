package groupProject2;

public class Registration {
	/*
	 * .Create Registration Class in which you would have variables as email,
	 * userName and password that have an access scope only within its own
	 * class. After creating an object of the class user should be able to call
	 * methods and in each method separately pass values to set users email,
	 * username and password.
	 * Requirements: 
	 * A.Valid email consider to be only yahoo 
	 * B.Valid userName and password cannot be empty and should be of
	 * length larger than 6 characters. Also valid password cannot contain
	 * userName.
	 * 
	 */
	private String email;
	private String userName;
	private String password;

	void setEmail(String email) {
		this.email=email;
		if(email.contains("yahoo")) {
			System.out.println(email);
		}else {
			System.out.println("Wrong email");
		}
		
	}
	void setUserName(String userName ) {
		this.userName=userName;
		if(!userName.isEmpty()&& userName.length()>6) {
			System.out.println(userName);
		}else {
			System.out.println("Wrong user name");
		}
	}
	void setPassword(String password) {
		this.password=password;
		if(!password.isEmpty() && password.length()>6 && !password.equals(userName)) {
			System.out.println(password);
		}else {
			System.out.println("Wrong password");
		}
	}
	public static void main(String[] args) {
		Registration obj = new Registration();
		obj.setEmail("manana@yahoo.com");
		obj.setUserName(" ");
		obj.setPassword("makarenachachacha");

	}
}

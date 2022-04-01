package com.syntax.class18;

public class Account {
	private String userName="Teyfur";
	private String password="Admin";   /// private can be accessed within the same class only, can't be accessed from the other class 
	                                      //directly, only using through methods.
	public String accountNumber="123456";
	private  double balance=-1500;
	
	private void printUsername() {
		System.out.println(userName);
	}
    protected void printPassword() {
    	System.out.println(password);
    }
    void printBalance() {
    	System.out.println(balance);
    }
    public void printAccountNumber() {
    	System.out.println(accountNumber);
    	
    }
	public static void main(String[] args) {
		Account acount=new Account();
		acount.printUsername();
		acount.printPassword();
		acount.printBalance();
		acount.printAccountNumber();
		

	}

}

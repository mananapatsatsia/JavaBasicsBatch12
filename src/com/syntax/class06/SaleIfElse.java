package com.syntax.class06;

import java.util.Scanner;

public class SaleIfElse {

	public static void main(String[] args) {
		String ans;
		int price=0;
		int disc=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you have a sale on that isem?");
	    ans=sc.next();
		
		
		if(ans.equalsIgnoreCase("No")){
			
			System.out.println("I am not shopping.");
			}
		
		else if(ans.equalsIgnoreCase("Yes"))
		 {
			System.out.println("How much does this cost?");
		     price=sc.nextInt();}
		else if(price<20) {
            disc=(price*10)/100;
			System.out.println("After discount 10% the price of the item reduced from "+price+" to "+disc);}
		
	    else if(price>20 && price<100) {
			disc=(price*20)/100;
			System.out.println("After discount 20% the price of the item reduced from "+price+" to "+disc);
		}else if(price>100 && price<500) {
			disc=(price*30)/100;
			System.out.println("After discount 30% the price of the item reduced from "+price+" to "+disc);

		}else if(price>500){
			disc=(price*50)/100;
			System.out.println("After discount 50% the price of the item reduced from "+price+" to "+disc);
		}
		}
			 
}
		
	



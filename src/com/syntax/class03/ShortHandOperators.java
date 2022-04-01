package com.syntax.class03;

public class ShortHandOperators {

	public static void main(String[] args) {
		//+, -, *, /, %
		int num=100;
		num=num+100;
		//equal  = is Assignment operator
		System.out.println(num);
		
		 //shorter way
		num+=100;
		 System.out.println(num);//300
		 
		 num-=20;
		 System.out.println(num);//280
		 
		 num/=10;
		 System.out.println(num);//28
		 
		 num%=2;//Mod-nachti
		 System.out.println(num);//0
		 
		// num%=3;
		// System.out.println(num);

	}

}

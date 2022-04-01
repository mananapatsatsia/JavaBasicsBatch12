package com.syntax.class15;

public class Task2 {

	public static void main(String[] args) {
//       String name="How are you guys @";
//       System.out.println(name.charAt(3));//chatAt();
//       for(int i=0; i<=name.length()-1;i++) {
//    	  
//    	   System.out.print(name.charAt(i));
//       }
//       String name1="How are you guys @";
//       System.out.println(name.charAt(3));//chatAt();
//       for(int i=0; i<=name.length()-1;i++) {
//    	  
//    	   System.out.print(name1.lastIndexOf(i));//lastIndexOf();
	//}
       String name2="How are @you @guys @";
       System.out.println(name2.indexOf("@"));
       System.out.println(name2.indexOf("%"));
       System.out.println(name2.indexOf("@", 8+1));

	}
}

package com.syntax.class03;

public class PrimitiveCasting {

	//public static void main(String[] args) {
            public static void main(String[] args) {
				//main+ctrl+space
            	
            	int i=10;
            	
            	//widening or implicit
            	//we store int value 10 inside double variable
            	double d=10;
            	
            	System.out.println(i);
            	System.out.println(d);
            	
            	//int num=10.0; //Type mismatch: cannot convert from double to int
            	
            //narrowing or explicit casting
            //we store double value 10.99 into int variable	
            int num=(int)10.99;
            System.out.println(num);
            	
            float f=10.99f; //Type mismatch: cannot convert from double to float
            byte b=(byte)128;
            System.out.println(b);
            
            	
            	
		
	}

}

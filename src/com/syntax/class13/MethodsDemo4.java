package com.syntax.class13;

public class MethodsDemo4 {
	double sale(boolean isSaleOn, double price, double discount)  {
		
	if(isSaleOn) {
		return (price-price*discount);
	}else {
		return price;
	}
	}

	public static void main(String[] args) {
		MethodsDemo4 obj=new MethodsDemo4();
		System.out.println(obj.sale(false, 100, .15));
		System.out.println(obj.sale(true, 100, .15));
	}

}//combination of the method name and parameters called-method signature

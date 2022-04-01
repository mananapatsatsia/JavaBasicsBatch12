package com.syntax.class26;

public class ShoppingCart {
     double originalPrice;
     double discount=.15;
     
     void setDiscount(double discount){
         if(discount>0&&discount<=.15){
             this.discount=discount;
         }else {
             System.out.println("Can't have that much discount");
         }
     }
     public double getDiscount(){
         return discount;
     }
     void calculatePrice() {
    	 double price=originalPrice-(originalPrice*discount);
    	 System.out.println(price);
     }
}

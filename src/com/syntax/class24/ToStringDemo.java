package com.syntax.class24;

public class ToStringDemo {
	String name;
	int age;
	ToStringDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		ToStringDemo toStringDemo=new ToStringDemo("Mr.a", 10);
		System.out.println(toStringDemo.toString());
		
	}
}

package com.bmpl.ConstructorInjection2;

public class A implements Z{
	
	private B b;
	
	//Default constructor
	public A() {
		System.out.println("A Constructor");
	}
	
	//parameterized constructor
	public A(B b) {
		System.out.println("A argument constructor");
		this.b = b;
	}
	
	public String show() {
		
		return "A show method";
	}
	
	public String print() {
		
		return b.print();
	}

	
	
}

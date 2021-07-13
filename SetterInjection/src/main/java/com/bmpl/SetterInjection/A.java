package com.bmpl.SetterInjection;

public class A implements Z{
	
	private B b;
	
	//Default constructor
	public A() {
		System.out.println("A Constructor");
	}
		
	//Setter Method
	public void setB(B b) {
		this.b = b;
	}


	//parameterized constructor
	public String show() {
		
		return "A show method";
	}
	
	public String print() {
		
		return b.print();
	}

	
	
}

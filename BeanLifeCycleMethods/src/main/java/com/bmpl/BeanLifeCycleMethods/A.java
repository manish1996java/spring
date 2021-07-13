package com.bmpl.BeanLifeCycleMethods;

public class A implements Z{
	
	private B b;
	
	//parameterized constructor
	public A(B b) {
		this.b = b;
	}
	
	public String show() {
		
		return "A show method";
	}
	
	public String print() {
		
		return b.print();
	}

	//create init method
	public void myInitialization() {
		System.out.println("init method run when bean create");
	}
	//create destroy method
	public void myDestruction() {
		System.out.println("destroy method run when bean destroy");
	}
	
	
}

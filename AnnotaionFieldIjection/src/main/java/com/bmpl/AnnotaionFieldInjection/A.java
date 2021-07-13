package com.bmpl.AnnotaionFieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//register as bean 
@Component
public class A implements Z{
	
	@Autowired
	private B b;
	
	public A() {
		System.out.println("Default Constructor");
	}
	
	public String show() {
		
		return "A show method";
	}
	
	public String print() {
		
		return b.print();
	}

}

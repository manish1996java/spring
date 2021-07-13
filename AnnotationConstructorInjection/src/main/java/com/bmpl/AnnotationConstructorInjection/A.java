package com.bmpl.AnnotationConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//using component annotation spring register as bean 
//inside the double quote its bean id
@Component("classA")
public class A implements Z{
	
	private B b;
	
	@Autowired
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

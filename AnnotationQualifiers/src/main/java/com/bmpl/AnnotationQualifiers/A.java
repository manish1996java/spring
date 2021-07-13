package com.bmpl.AnnotationQualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class A implements Z{
	
	@Autowired
//	@Qualifier("b")
	@Qualifier("d")
	private Y y;
	
	//Default constructor
	public A() {
		System.out.println("A Constructor");
	}
	
	
	public String show() {
		
		return "A show method";
	}
	
	public String print() {
		
		return y.print();
	}

	
	
}

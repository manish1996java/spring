package com.bmpl.AnnotationSetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*using component annotation without id internally spring gives default name in camel
  case like -- Moters-->moters, StudentOperation-->studentOperation */
@Component
public class A implements Z{
	
	private B b;
	
	//Default constructor
	public A() {
		System.out.println("A Constructor");
	}
		
	//Setter Method
	@Autowired
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

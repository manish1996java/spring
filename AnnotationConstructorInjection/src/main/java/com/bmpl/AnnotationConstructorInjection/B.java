package com.bmpl.AnnotationConstructorInjection;

import org.springframework.stereotype.Component;

//using component annotation spring register as bean 
//inside the double quote its bean id
@Component("classB")

public class B implements Y{
	
	//Default constructor
	public B() {
		System.out.println("B Constructor");
	}
	
	public String print()
	{	
	return "B print method";
	}
}

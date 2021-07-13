package com.bmpl.AnnotaionFieldInjection;

import org.springframework.stereotype.Component;

//register as bean 
@Component
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

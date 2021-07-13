package com.bmpl.AnnotationScopePrototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

	
@Component					/*register as bean*/
@Scope("prototype") 		/*scope annotation or type of scope in double quote*/
public class A{
	
	
	//Default constructor
	public A() {
		System.out.println("A Constructor");
	}
			
}

package com.bmpl.AnnotationScopeSingleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class A{
	
	
	//Default constructor
	public A() {
		System.out.println("A Constructor");
	}
			
}

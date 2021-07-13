package com.bmpl.AnnotationQualifiers;

import org.springframework.stereotype.Component;

@Component
public class D implements Y {


	public D() {
		System.out.println("D constructor");
	}
	
	public String print() {
		
		return "D print method";
	}

}

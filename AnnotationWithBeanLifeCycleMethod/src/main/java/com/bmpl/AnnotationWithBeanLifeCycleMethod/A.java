package com.bmpl.AnnotationWithBeanLifeCycleMethod;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//register as bean
@Component  		
public class A{
	
	//Default constructor
	public A() {
		System.out.println("A Constructor");
	}
			
	public String doWork() {
		
		return "Do Work";
	}
	
	public String doPrint() {
		
		return "Do Print";
	}
	
	
	//create init method with PostConstruct Annotation
	@PostConstruct
	public void myInitialization() {
		System.out.println("init method run when bean create");
	}
	
	//create destroy method with PreDestroy
	@PreDestroy
	public void myDestruction() {
		System.out.println("destroy method run when bean destroy");
	}
	
}

package com.bmpl.InjectLiteralValue;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String args[]) {
		
		
//  load config file
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
//	retrive bean
	A a = context.getBean("classA",A.class);
	
	
	//call method
	System.out.println(a.show());
	System.out.println(a.getName());
	System.out.println(a.getDob());
	System.out.println(a.getPhone());
	System.out.println(a.getEmail());
	
	//close context
	context.close();
	}
}

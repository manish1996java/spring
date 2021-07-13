package com.bmpl.ConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //load config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	//retrive bean
    	A a = context.getBean("classA",A.class);
    	
    	//call method
    	System.out.println(a.print());
    	
    	//call method
    	System.out.println(a.show());
    	
    	//close context
    	context.close();
    	
    	
    }
}

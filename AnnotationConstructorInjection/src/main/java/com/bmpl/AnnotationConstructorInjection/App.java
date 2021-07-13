package com.bmpl.AnnotationConstructorInjection;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//      load config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	
//    	retrive bean
    	Z z = context.getBean("classA",Z.class);
    	
    	//call method
    	System.out.println(z.print());
    	
    	//call method
    	System.out.println(z.show());
    	
    	//close context
    	context.close();
    	
    }
}

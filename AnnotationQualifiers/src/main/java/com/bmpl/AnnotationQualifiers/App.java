package com.bmpl.AnnotationQualifiers;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//      load config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
//    	retrive bean
//    	Z z = context.getBean("a",Z.class);
    	Z z = context.getBean("c",Z.class);
    	
    	//call method
    	System.out.println(z.print());
    	
    	//call method
    	System.out.println(z.show());
    	
    	//close context
    	context.close();
    	
    }
}

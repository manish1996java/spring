package com.bmpl.AnnotaionFieldInjection;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//      load config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	
//    	retrive bean
    	Z z = context.getBean("a",Z.class);
    	
    	//call method
    	System.out.println(z.print());
    	
    	//call method
    	System.out.println(z.show());
    	
    	//close context
    	context.close();
    	
    }
}

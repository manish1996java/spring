package com.bmpl.AnnotationScopeSingleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
//    	load config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
//    	retrive beans
    	A firstA = context.getBean("a",A.class);
    	A secondA = context.getBean("a",A.class);
    	
    	System.out.println("first A :"+firstA);
    	System.out.println("second A :"+secondA);
    	
    	System.out.println("is refer same object :"+(firstA==secondA));
    	
//    	close resources
    	context.close();
    }
}
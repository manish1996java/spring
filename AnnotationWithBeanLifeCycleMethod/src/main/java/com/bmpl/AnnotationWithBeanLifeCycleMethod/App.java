package com.bmpl.AnnotationWithBeanLifeCycleMethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
//    	load config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
//    	retrive beans
    	A a = context.getBean("a",A.class);

    	System.out.println(""+a.doWork());
    	System.out.println(""+a.doPrint());
    	
//    	close resources
    	context.close();
    }
}
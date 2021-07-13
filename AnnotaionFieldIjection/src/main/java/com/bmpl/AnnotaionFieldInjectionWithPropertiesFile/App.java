package com.bmpl.AnnotaionFieldInjectionWithPropertiesFile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	//load config file
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
    	
    	//get bean
    	A a = context.getBean("a",A.class);
    	
    	System.out.println(a.getName());
    	System.out.println(a.getDob());
    	System.out.println(a.getPhone());
    	System.out.println(a.getEmail());
    	
    	//close resource
    	context.close();
    }
}
